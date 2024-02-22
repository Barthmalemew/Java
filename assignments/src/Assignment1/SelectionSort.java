package Assignment1;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        Random rand = new Random();

        int[]List = new int[10];
        for (int i = 0; i < List.length; i++)
        {
            List[i] = rand.nextInt(200 - 100) + 100;
        }

        System.out.println(Arrays.toString(List));
        sort(List);
        System.out.println(Arrays.toString(List));
    }

    private static void sort(int[] List){
        int temp;

        for (int i = 0; i < List.length; i++)
        {
            for (int j = i + 1; j < List.length; j++)
            {
                if(List[j] < List[i])
                {
                    temp = List[j];
                    List[j] = List[i];
                    List[i] = temp;
                }
            }
        }
    }
}
