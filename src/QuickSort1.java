
public class QuickSort1 {
	public static void main(String[] args) {
		int[] array = {19, 7, 4, 12, 11, 8, 3, 2};
		
	}
	
	public static int seperation(int[] arr, int i, int j) {
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
			int ri = seperation(arr, i, j);
			while(i<ri-1) {
				quickSortRecursion(arr, i, ri-1);
			}
			while(ri < j) {
				quickSortRecursion(arr, ri, j);
			}
	}
}
