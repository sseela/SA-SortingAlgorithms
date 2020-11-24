package com.practice;

import java.util.Arrays;

public class MergeSort2 {
	static int[] array;
	static int[] tempArray;
	public static void main(String[] args) {
		int[] arr = {3, 23, 43, 21, 2, 1};
		array = arr;
		tempArray = new int[array.length];
		divideArray(0, array.length-1);
		System.out.println(Arrays.toString(arr));
	}
	private static void divideArray(int i, int j) {
		if(i<j) {
			int midpoint = i +(j-i)/2;
			divideArray(i, midpoint);
			divideArray(midpoint+1, j);
			merge(i, j, midpoint);
		}
		
	}
	private static void merge(int low, int high, int midpoint) {
		for(int i=low; i<=high; i++) {
			tempArray[i] = array[i];
		}
		int i=low;
		int j=midpoint+1;
		int k=low;
		while(i<=midpoint && j<=high) {
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
			i++;
			k++;
		}
		
	}
}
