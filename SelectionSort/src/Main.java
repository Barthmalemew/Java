import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {2,4,7,8,9,8,1,3,4,6,8};
        sort(array);

        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] a)
    {
        int smallest;

        for (int i = 0; i < a.length - 1; i++){
            for(int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    smallest = a[j];
                    a[j] = a[i];
                    a[i] = smallest;
                }
            }
        }
    }
}