package ExceptionPractice;

import java.util.Scanner;
public class TimeConvert
{
    public static void timeTo12(int _hour, int _minute) throws TimeOutOfRangeException
    {
        String identifier = "am";
        if((_hour > 24 || _hour < 0) || (_minute > 60 || _minute < 0))
        {
            throw new TimeOutOfRangeException("The hour or minute value you entered is outside of the expected bounds.");
        }
        if(_hour > 12)
        {
            _hour -= 12;
            identifier = "pm";

        }
        else if(_hour == 0)
        {
            _hour += 12;
        }
        System.out.printf("Your converted time is %d:%02d%s\n",_hour,_minute,identifier);
    }
    public static void main(String[] args)
    {
        int hour, minute;
        Scanner kbReader = new Scanner(System.in);
        for(int i = 0; i < 3; i++)
        {
            try
            {
                System.out.println("Enter the hour of the time you want to convert to the 12 hour format: ");
                hour = kbReader.nextInt();
                System.out.println("Enter the minute of the time you want to convert to the 12 hour format: ");
                minute = kbReader.nextInt();
                timeTo12(hour,minute);
                break;
            }
            catch(TimeOutOfRangeException e)
            {
                if(i < 2)
                {
                    System.out.println(e.getMessage());
                    System.out.println("Please re-enter the time you wish to convert to the 12-hour format");
                }
                else
                {
                    System.exit(1);
                }
            }
        }

    }


}
