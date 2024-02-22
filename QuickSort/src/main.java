public class main{ 
    public static void main(String[] args) {
        int[] array = {12, 3, 4, 40, 22, 100};
        int n = array.length;
        QuickSort q1 = new QuickSort();
        q1.PrintArr(array, n);
        q1.Sort(array, 0, n - 1);
        q1.PrintArr(array, n);
    }
}
