import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {38, 52, 9, 18, 6, 62, 13};
		int min;
		for(int i=0; i<arr.length; i++) {
			min = i;
			for(int j=i+1; j<arr.length; j++) {
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
