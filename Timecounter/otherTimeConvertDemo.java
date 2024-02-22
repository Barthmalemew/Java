package ExceptionPractice;

import java.util.Scanner;

public class otherTimeConvertDemo
{
    public static void main(String[] args)
    {
        int hour, minute;
        Scanner kbReader = new Scanner(System.in);

        try
        {
            System.out.println("Enter the hour of the time you want to convert to the 12 hour format: ");
            hour = kbReader.nextInt();
            System.out.println("Enter the minute of the time you want to convert to the 12 hour format: ");
            minute = kbReader.nextInt();
            TimeConvert.timeTo12(hour,minute);
        }
        catch(TimeOutOfRangeException e)
        {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}
