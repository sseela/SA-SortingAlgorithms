import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] array = {34, 22, 43, 21, 21};
		int temp = 0;
		
		for(int i=0; i<array.length; i++) {
			int flag=0;
			for(int j=0; j<array.length-1-i; j++) {
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					flag++;
				}
			}
			if(flag==0) 
				break;
		}
		System.out.println(Arrays.toString(array));
	}
}

//Bubble sort time complexity - best O(n)      worst O(n2)
//space - O(1)