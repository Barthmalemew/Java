import org.w3c.dom.ls.LSOutput;

public class BinarySearchDemo {
    public static void main(String[] args){
        int[] test = new int[]{2,3,4,6,7,12};
        int target = 6;

        BinarySearch(test, 0, test.length, target);
    }

    static int BinarySearch(int[] arr, int left, int right, int target){
        int middle = (left + right) / 2;

        if(right < left){
            return -1;
        }
        if(target < arr[middle]){
            return BinarySearch(arr, left, middle - 1, target);
        }
        if(target > arr[middle]){
            return BinarySearch(arr, middle + 1, right, target);
        }
        if (target == arr[middle]){
            System.out.println(middle);
            return middle;
        }
        return -1;
    }
}