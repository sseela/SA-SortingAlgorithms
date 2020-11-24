package com.practice;

import java.util.Arrays;

public class QuickSortExample {
	public static void main(String[] args) {
		int[] arr = {19, 3, 32, 12, 4, 23};
		recursion(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	private static int segregate(int[] arr, int i, int j) {
		int pivot = arr[(i+j)/2];
		while(i<=j) {
			while(arr[i] < pivot) {
				i++;
			}
			while(arr[j] > pivot) {
				j--;
			} 
			if(i<=j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++; 
				j--;
			}
		}
		return i;
	}
	
	private static void recursion(int[] arr, int i, int j) {
		int ri = segregate(arr, i, j);
		if(i< ri-1) {
			recursion(arr, i, ri-1);
		} 
		if(ri < j) {
			recursion(arr, ri, j);
		}
	}
	
}
