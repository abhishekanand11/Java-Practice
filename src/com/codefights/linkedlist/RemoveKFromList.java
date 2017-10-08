package com.codefights.linkedlist;



public class RemoveKFromList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[3, 1, 2, 3, 4, 5]
		ListNode<Integer> list = new ListNode<Integer>(1000);
		list.next = new ListNode<Integer>(1000);
		list.next.next = new ListNode<Integer>(1000);
		list.next.next.next = new ListNode<Integer>(1000);
		//list.next.next.next.next = new ListNode<Integer>(4);
		//list.next.next.next.next.next = new ListNode<Integer>(5);
		ListNode<Integer> head = removeKFromList(list, 1000);;
		while(head != null){
			System.out.println(head.value);
			head = head.next;
		}
	}

	// Definition for singly-linked list:
	static class ListNode<T> {
		ListNode(T x) {
			value = x;
		}

		T value;
		ListNode<T> next;
	}

	static ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
		ListNode<Integer> head = l;
		ListNode<Integer> prev = null;
		while(head != null && head.value == k){
			l = head.next;
			head = l;
		}
		while (head != null) {
			while (head != null && head.value != k) {
				prev = head;
				head = head.next;
			}

			if (head == null)
				return l;
			prev.next = head.next;

			head = prev.next;
		}
		
	return l;

	}
}
