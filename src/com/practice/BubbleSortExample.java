package com.practice;

public class BubbleSortExample {
	public static void main(String[] args) {
		int[] arr = {-13, -2, 53, 7, 22, 8};
		int temp=0;
		for(int i=0; i<arr.length; i++) {
			int flag = 0;
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					flag++;
				}
			}
			if(flag ==0) {
				break;
			}
		}
		for(int i: arr) {
			System.out.println(i);
		}
		
	}
}
