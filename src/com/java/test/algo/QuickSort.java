package com.java.test.algo;

public class QuickSort {
	private int [] array;
	private int length;
	
	private void exchangeNumbers(int i, int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public void sort(int [] inputArray){
		if(inputArray == null || inputArray.length == 0){
			return;
		}
		this.array = inputArray;
		this.length = inputArray.length;
		quickSort(0, length-1);
	}
	
	private void quickSort(int lowerIndex, int higherIndex) {
		int i = lowerIndex;
		int j = higherIndex;
		int pivot = higherIndex - (higherIndex - lowerIndex) / 2;

		while (i <= j) {
			while (array[i] < array[pivot]) {
				i++;
			}
			while (array[j] > array[pivot]) {
				j--;
			}
			if (i <= j) {
				exchangeNumbers(i, j);
				i++;
				j--;
			}
		}
		if (lowerIndex < j) {
			quickSort(lowerIndex, j);
		}
		if (i < higherIndex) {
			quickSort(i, higherIndex);
		}
	}

}
