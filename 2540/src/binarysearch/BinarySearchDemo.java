package binarysearch;

import java.awt.Point;
import java.util.Random;

import javax.net.ssl.SSLContext;

public class BinarySearchDemo {
	public static void main(String[] args)
	{
		QuickSort demo = new QuickSort();
		
		int result;
		
		int[] arr = new int[10]; 
		
		Random random = new Random();
		
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = random.nextInt(10) + 1; 
		}
		
		for(int i: arr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		demo.sort(arr, 0, arr.length - 1);
		
		for(int i: arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		BinarySearch search = new BinarySearch();
		
		result = search.BinarySearchIterative(arr, 5);	
		
		if(result == -1)
		{
			System.out.println("iterative: Element cannot be found");
		}
		else {
			System.out.println("iterative: target is 5, target at index " + result);
		}
		result = search.BinarySearchRecursive(arr, 0, arr.length - 1, 7);
		
		if(result == -1)
		{
			System.out.println("recursive: Element cannot be found");
		}
		else {
			System.out.println("recursive: target is 7, target at index " + result);
		}
	}
}

class BinarySearch {
	
	public int BinarySearchIterative(int[] arr, int target) {
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
				return middle;
			}
		}
		return -1;
	}
	
	static int BinarySearchRecursive(int[] arr, int start, int end, int target) {
		
			int middle = (start + end) / 2;
			
			if(end < start) {
				return -1;
			}
		
			if (target < arr[middle]) {
				return BinarySearchRecursive(arr, start, middle - 1, target);
			}
			if (target > arr[middle]) {
				return BinarySearchRecursive(arr, middle + 1, end, target);
			}
			if (target == arr[middle]) {
				return middle;
			}
			return -1;
	} 
}