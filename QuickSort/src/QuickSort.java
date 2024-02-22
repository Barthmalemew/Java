public class QuickSort {
    int Partition(int[] arr, int start, int end)
    {
        int pivot = arr[end];
        int sElement = (start - 1);

        for (int index = start; index <= end - 1; index++){

            if (arr[index] < pivot)
            {
                sElement++;
                int temp = arr[sElement];
                arr[sElement] = arr[index];
                arr[index] = temp;
            }
        }

        int temp = arr[sElement + 1];
        arr[sElement + 1] = arr[end];
        arr[end] = temp;
        return (sElement + 1);
    }

    void Sort(int[] arr, int start, int end)
    {
        if (start < end)
        {
            int p = Partition(arr, start, end);
            Sort(arr, start, p - 1);
            Sort(arr, p + 1, end);
        }
    }

    void PrintArr(int[] arr, int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
