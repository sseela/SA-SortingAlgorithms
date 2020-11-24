import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] array = {5, 5, 2, 1, 2, 3, 4};
		quickSortRecursion(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}
	
	public static int partition(int[] arr, int i, int j) {
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
	
	public static void quickSortRecursion(int[] arr, int i, int j) {
		int pi = partition(arr, i, j);
		if(i < pi-1) {
			quickSortRecursion(arr, i, pi-1);
		}
		if(pi < j) {
			quickSortRecursion(arr, pi, j);
		}
	}
}
