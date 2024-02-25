import java.util.Random;
import java.util.Scanner;

public class BinarySearchDemo {
    public static void main(String[] args)
    {
        Random rand = new Random();
        int[] test = new int[10];

        for (int i = 0; i < test.length; i++){
            test[i] = rand.nextInt(10);
        }

        Scanner input = new Scanner(System.in);

        int user = input.nextInt();
        int n = test.length;

        printArray(test);
        binarySearch(test, 0, n - 1, user);
    }

    static int binarySearch(int[] arr, int left, int right, int target){
        if(left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == target)
                return mid;

            else if(arr[mid] > target)
                return binarySearch(arr, left, mid - 1, target);

            else
                return binarySearch(arr,mid + 1, right, target);
        }
        return -1;
    }

    static void printArray(int[] arr){
        for(int i : arr) {
            System.out.print(arr[i] + " ");
        }
    }
}
