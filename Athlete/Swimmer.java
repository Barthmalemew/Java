package ECUAthlete;

public class Swimmer extends Athlete
{
    public Swimmer()
    {
        this("","00000000",0,"","",0,0);
    }
    public Swimmer(String name, String id, int _age, String _gender, String _major, int _maxDiveHeight, int _maxSwimDistance)
    {
        super(name,id,_age,_gender,_major);
        maxDiveHeight = _maxDiveHeight;
        maxSwimDistance = _maxSwimDistance;
    }
    public void setMaxDiveHeight(int diveHeight)
    {
        maxDiveHeight = diveHeight;
    }
    public void setMaxSwimDistance(int swimDistance)
    {
        maxSwimDistance = swimDistance;
    }
    public int getMaxDiveHeight()
    {
        return maxDiveHeight;
    }
    public int getMaxSwimDistance()
    {
        return maxSwimDistance;
    }
    public int getLAPDISTANCE()
    {
        return LAPDISTANCE;
    }
    public int swimLaps()
    {
        return maxSwimDistance / LAPDISTANCE;
    }
    public void displayInfo()
    {
        super.displayInfo();
        System.out.printf("Max Dive Height: %d\nMax Swim Distance: %d\n\n",maxDiveHeight,maxSwimDistance);
    }
    private int maxDiveHeight;
    private int maxSwimDistance;
    private final int LAPDISTANCE = 50;
}
