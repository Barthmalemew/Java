package binarysearch;

import java.util.Random;

public class BinarySearchDemo {
	p static void main(String[] args) {
		QuickSort demo = new QuickSort();
		
		int[] arr = new int[10]; 
		
		Random random = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100) + 1; 
		}
		
		demo.sort(arr, 0, arr.length);
		
		BinarySearch search = new BinarySearch();
		
		search.BinarySearchIterative(arr, 5);
		
	}
}

class BinarySearch {
	
	static int BinarySearchIterative(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		
		while (start <= end) {
			int middle = (start + end) / 2;
			
			if (target < arr[middle]) {
				end = middle - 1;
			}
			if (target > arr[middle]) {
				start = middle + 1;
			}
			if (target == arr[middle]) {
				System.out.println(middle);
				return middle;
			}
		}
		return -1;
	}
}