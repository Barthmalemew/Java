public class BinarySearchDemo {
    public static void main(String[] args)
    {
        int[] test = new int[]{2, 3 ,1, 6 ,15, 7 ,2, 11};

        BinarySearch(test, 4);
    }

    static int BinarySearch(int[] arr, int target)
    {
        int left = 0;
        int right = arr.length - 1;

        while (left<=right)
        {
            int middle = (right - left) / 2;

            if(arr[middle] == target)
                return middle;
            else if(arr[middle] > target)
                right = middle - 1;
            else
                left = middle + 1;
        }
        return -1;
    }
}
