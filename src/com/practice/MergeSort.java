package com.practice;

public class MergeSort {
	static int[] array;
	static int[] tempArray;
	int length;
	public static void main(String[] args) {
		int[] arr = {12, 4, 21, 3, 56, 32, 2};
		sort(arr);
		for(int i: arr) {
			System.out.println(i);
		}
	}

	private static void sort(int[] arr) {
		array = arr;
		tempArray = new int[array.length];
		divideArray(0, array.length-1);
	}

	private static void divideArray(int i, int j) {
		if(i<j) {
			int midpoint = i + (j-i)/2;
			
			divideArray(i, midpoint);
			divideArray(midpoint+1, j);
			
			mergeArray(i, j, midpoint);
		}
	}

	private static void mergeArray(int low, int high, int midpoint) {
		for(int i=low; i<=high; i++) {
			tempArray[i] = array[i];
		}
		int i= low;
		int j= midpoint+1;
		int k= low;
		while(i<=midpoint && j<=high) {
			if(tempArray[i] <= tempArray[j]) {
				array[k] = tempArray[i];
				i++;
			} else {
				array[k] = tempArray[j];
				j++;
			}
			k++;
		}
		
		while(i<=midpoint) {
			array[k] = tempArray[i];
			k++;
			i++;
		}
		
	}
}
