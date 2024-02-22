import java.util.Random;

public class InsertionSort {
    public static void main(String[] args){
        int[] test = new int[10];

        Random rand = new Random();

        for (int i = 0; i < test.length; i++)
        {
            test[i] = rand.nextInt(150) + 50;
        }

        printArray(test);
        sort(test);
        printArray(test);
    }

    static void sort(int[] arr) {
        for (int position = 1; position < arr.length; position++) {
            int pivot = arr[position];
            int check = position - 1;

            while(check > -1 && arr[check] > pivot) {
                arr[check + 1] = arr[check];

                check--;
            }
            arr[check + 1] = pivot;
        }
    }

    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
