import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] testArray = new int[20];

		for(int i = 0; i < testArray.length; i++)
		{
			testArray[i] = rand.nextInt(1000);
		}

		printArray(testArray);
		mergeSort(testArray);
		printArray(testArray);
	}
	
	static void mergeSort(int[] arr) {
		int arrayLength = arr.length;

		if(arrayLength < 2)
		{
			return;
		}

		int middle = arrayLength / 2;

		int[] left = new int[middle];
		int[] right = new int[arrayLength - middle];

		for(int i = 0; i < middle; i++)
		{
			left[i] = arr[i];
		}

		for (int i = middle; i < arrayLength; i++)
		{
			right[i - middle] = arr[i];
		}

		mergeSort(left);
		mergeSort(right);

		merge(arr, left, right);
	}
	
	static void merge(int[] arr, int[] leftHalf, int[] rightHalf) {

		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;

		int indexLeft = 0;
		int indexRight = 0;
		int indexMerge = 0;

		while(indexLeft < leftSize && indexRight < rightSize)
		{
			if(leftHalf[indexLeft] <= rightHalf[indexRight]){
				arr[indexMerge] = leftHalf[indexLeft];
				indexLeft++;
			}
			else{
				arr[indexMerge] = rightHalf[indexRight];
				indexRight++;
			}
			indexMerge++;
		}

		while (indexLeft < leftSize)
		{
			arr[indexMerge] = leftHalf[indexLeft];
			indexLeft++;
			indexMerge++;
		}

		while (indexRight < rightSize)
		{
			arr[indexMerge] = rightHalf[indexRight];
			indexRight++;
			indexMerge++;
		}
		
	}
	
	static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
