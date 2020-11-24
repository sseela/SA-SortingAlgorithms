package com.practice;

public class MergeSort1 {
	static int[] array;
	static int[] tempArray;
	public static void main(String[] args) {
		int[] arr = {12, 3, 45, 32, 4, 56};
		array = arr;
		tempArray = new int[array.length];
		divideArray(0, arr.length-1);
		for(int i: arr) {
			System.out.println(i);
		}
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
		while(i<= midpoint && j<=high) {
			if(tempArray[i] < tempArray[j]) {
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
