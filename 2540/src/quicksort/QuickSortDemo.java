package quicksort;

import java.util.Random;

public class QuickSortDemo {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] array = new int[10];
		
		for(int i = 0; i < array.length; i++)
		{
			array[i] = random.nextInt(100) + 1;
		}
		
		for(int i: array) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		QuickSort quickSort = new QuickSort();
		
		quickSort.sort(array, 0, array.length - 1);
		
		for(int i: array) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}
}

class QuickSort {
	
	static int partition(int[] arr, int start, int end) {
		
		int pivot = arr[end];
		int i = start - 1;
		
		for(int j = start; j <= end - 1; j++ ) {
			
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = arr[end];
		arr[end] = temp;
		 
		return i;
	}
	
	static void sort(int[] arr, int start, int end) {
		if(start < end) {
			
			int pivot = partition(arr, start, end);
			
			sort(arr, start, pivot - 1);

			sort(arr, pivot + 1, end);
		}
		
	}
}




