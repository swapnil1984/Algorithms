package com.swapnil.mergesort;

public class MyMergeSortApp {

	public static void main(String[] args) {
		int [] array = { 5, 8, 6, 1, 7, 10 , 15, 4, 12, 11, 7, 8, 9, 1, 20};
		
		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(array);
		
		for(int i = 0;i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
	}
}