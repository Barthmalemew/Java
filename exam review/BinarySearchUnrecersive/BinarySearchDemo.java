public class BinarySearchDemo {
    public static void main(String[] args){
        int[] test = new int[]{2, 3, 4, 8, 10};
        int target = 4;

        BinarySearch(test, target);
    }

    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if(target < arr[middle])
            {
                end = middle - 1;
            }
            if(target > arr[middle]){
                start = middle + 1;
            }
            if(target == arr[middle]){
                System.out.println(middle);
                return middle;
            }
        }

        return -1;
    }
}