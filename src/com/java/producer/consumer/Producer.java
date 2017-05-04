package com.java.producer.consumer;

import java.util.List;

public class Producer implements Runnable {

	private final List<Integer> taskQueue;
	   private final int           MAX_CAPACITY;
	 
	   public Producer(List<Integer> sharedQueue, int size)
	   {
	      this.taskQueue = sharedQueue;
	      this.MAX_CAPACITY = size;
	   }
	 
	   @Override
	   public void run()
	   {
	      int counter = 0;
	      while (true)
	      {
	         try
	         {
	            produce(counter++);
	         } 
	         catch (InterruptedException ex)
	         {
	            ex.printStackTrace();
	         }
	      }
	   }
	 
	   private void produce(int i) throws InterruptedException
	   {
	      synchronized (taskQueue)
	      {
	         while (taskQueue.size() == MAX_CAPACITY)
	         {
	            System.out.println("Queue is full " + Thread.currentThread().getName() +"_"+ i + " is waiting , size: " + taskQueue.size());
	            taskQueue.wait();
	         }
	         System.out.println(Thread.currentThread().getName() +"_"+ i + " before waiting is : " + System.currentTimeMillis());
	         Thread.sleep(10000);
	         System.out.println(Thread.currentThread().getName() +"_"+ i + " after waiting is : " + System.currentTimeMillis());
	         taskQueue.add(i);
	         System.out.println("Produced: " + i);
	         taskQueue.notifyAll();
	      }
	   }
}
