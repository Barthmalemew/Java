package ECUAthlete;
import java.util.Random;
public class TennisPlayer extends Athlete
{
    public TennisPlayer()
    {
        this("","00000000",0,"","",0,0.0);
    }

    /**
     * This constructs a new tennis player object using the values provided for the parameters
     * @param name A String representing the players name
     * @param ID A String representing the players banner id
     * @param _age An integer representing the players age
     * @param _gender The players gender as a String
     * @param _major The players major as a String
     * @param _skillLevel The players skill level in integer format
     * @param _hitAccuracy The players accuracy as a double in either percent or decimal form from 0 to 100 for percent form and 0.00 to 1.00 in decimal form
     */
    public TennisPlayer(String name, String ID,int _age, String _gender, String _major,int _skillLevel, double _hitAccuracy)
    {
        super(name,ID,_age,_gender,_major);
        skillLevel = _skillLevel;
        hitAccuracy = _hitAccuracy;
    }
    public int getSkillLevel()
    {
        return skillLevel;
    }
    public double getHitAccuracy()
    {
        return hitAccuracy;
    }
    public void setSkillLevel(int _level)
    {
        skillLevel = _level;
    }
    public void setAccuracy(double accuracy)
    {
        hitAccuracy = accuracy;
    }
    public void swing()
    {
        Random rndm = new Random();
        int chanceInt, percentInt;
        double percent, decimalPortion;
        if(this.hitAccuracy <= 1.00)
        {
            percent = this.hitAccuracy * 100;
        }
        else
        {
            percent = this.hitAccuracy;
        }
        percentInt = (int)Math.floor(percent);
        chanceInt = rndm.nextInt(101);
        decimalPortion = percent - percentInt;
        if(chanceInt <= percentInt)
        {
            if(chanceInt == percentInt)
            {
                if(rndm.nextDouble() <= decimalPortion)
                {
                    this.hit();
                }
                else
                {
                    this.miss();
                }
            }
            else
            {
                this.hit();
            }
        }
        else {
            this.miss();
        }
    }
    private void hit()
    {
        System.out.println("The ball was hit");
    }
    private void miss()
    {
        System.out.println("The ball was missed");
    }
    public void displayInfo()
    {
        super.displayInfo();
        System.out.printf("Skill Level: %d\nAccuracy: %.2f%%\n\n",skillLevel, hitAccuracy);
    }
    private int skillLevel;
    private double hitAccuracy;
    //private Style playStyle;
}
