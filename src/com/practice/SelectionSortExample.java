package com.practice;

import java.util.Arrays;

public class SelectionSortExample {
	public static void main(String[] args) {
		int[] arr = {10, 2, 4, 64, 22, 42};
		int min = 0;
		for(int i=0; i<arr.length; i++) {
			min = i;
			for(int j=i+1; j<arr.length-1; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
