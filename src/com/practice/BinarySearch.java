package com.practice;

public class BinarySearch {
	static int target = 6;
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		recursion(arr, 0, arr.length-1);
	}

	private static void recursion(int[] arr, int i, int j) {
		if(i<=j) {
			int midpoint = i +(j-i)/2;
			int mid_element = arr[midpoint];
			if(mid_element == target) {
				System.out.println("found at index "+i);
			} else if(target < mid_element) {
				recursion(arr, i, midpoint-1);
			} else if(target > mid_element) {
				recursion(arr, midpoint+1, j);
			} 
		} 
		
	}
}
