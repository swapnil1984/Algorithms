package com.swapnil.mergesort;

public class MergeSort {
	public void mergeSort(int[] array) {
		int length;
		int mid;
		int[] left;
		int[] right;
		
		length = array.length;
		
		if (length < 2)
			return;
		
		mid = length / 2;
		
		left = new int[mid];
		right = new int[length - mid];
		
		for(int i = 0;i <= mid - 1;i++) {
			left[i] = array[i];
		}
		
		for(int i = mid;i <= length - 1;i++) {
			right[i - mid] = array[i];
		}
		
		mergeSort(left);
		mergeSort(right);
		merge(left, right, array);
				
	}

	private void merge(int[] left, int[] right, int[] array) {
		int nL;
		int nR;
		int i = 0;
		int j = 0;
		int k = 0;
		
		nL = left.length;
		nR = right.length;
		
		while(i < nL && j < nR) {
			if (left[i] <= right[j]) {
				array[k] = left[i];
				i++;
			}
			else {
				array[k] = right[j];
				j++;
			}
			k++;
		}
		while(i < nL) {
			array[k] = left[i];
			i++;
			k++;
		}
		while(j < nR) {
			array[k] = right[j];
			j++;
			k++;
		}
	}
}
