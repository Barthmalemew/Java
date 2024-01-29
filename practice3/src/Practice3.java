public class Practice3 {
    public static void main(String[] args) {
        Generate generate = new Generate();
        Largest largest = new Largest();
        Smallest smallest = new Smallest();
        Average average = new Average();

        int[] boxes = new int[10];


        generate.getValues(boxes);
        largest.getLargest(boxes);
        smallest.getSmallest(boxes);
        average.getAverage(boxes);
    }

}

class Generate{
    int i = 0;

    void getValues(int[] boxes){
        while(i < 10){
            boxes[i] = (int)(Math.random()*101);
            i++;
        }
    }
}

class Largest{
    int Largest = 0;
    int i = 0;

    void getLargest(int[] boxes)
    {
        while(i < 10)
        {
            if(boxes[i] > Largest)
            {
                Largest = boxes[i];
            }
            i++;
        }
        System.out.println("The largest is: " + Largest);
    }
}

class Smallest{
    int smallest = 0;
    int i = 0;

    void getSmallest(int[] boxes) {
        while (i < 10)
        {
            if(boxes[i] < smallest || smallest == 0)
            {
                smallest = boxes[i];
            }
            i++;
        }
        System.out.println("The smallest is: " + smallest);
    }
}

class Average{
    int i = 0;
    double avg = 0;
    void getAverage(int[] boxes){
        while(i < 10)
        {
            avg += boxes[i];
            i++;
        }
        System.out.println("The average is: " + (avg / i));
    }
}