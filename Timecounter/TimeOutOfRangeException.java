package ExceptionPractice;

public class TimeOutOfRangeException extends Exception
{
    public TimeOutOfRangeException()
    {
        super("Time is out of expected range");
    }
    public TimeOutOfRangeException(String s)
    {
        super(s);
    }
}
