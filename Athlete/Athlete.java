package ECUAthlete;

public class Athlete extends Person
{
    public Athlete()
    {
        this("","00000000",1,"","");
    }
    public Athlete(String name, String id, int _age, String _gender, String _major)
    {
        super(name,id);
        age = _age;
        gender = _gender;
        major = _major;
    }
    public int getAge()
    {
        return age;
    }
    public String getGender()
    {
        return gender;
    }
    public String getMajor()
    {
        return major;
    }
    public void setAge(int _age)
    {
        age = _age;
    }
    public void setGender(String _gender)
    {
        gender = _gender;
    }
    public void setMajor(String _major)
    {
        major = _major;
    }

    public void displayInfo()
    {
        super.displayInfo();
        System.out.printf("Age: %d\nGender: %s\nMajor: %s\n",age,gender,major);
    }

    private int age;
    private String gender;
    private String major;
}
