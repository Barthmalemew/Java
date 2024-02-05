package people;

public class Student extends Person {
    String major;
    double GPA;

    public Student(){
        super();
        major = "NA";
        GPA = 0;
    }

    public Student(String name, String BannerID, String major, double GPA)
    {
        super(name, BannerID);
        this.major = major;
        this.GPA = GPA;
    }

    public double getGPA(double GPA){
        return GPA;
    }

    public String getMajor(){
        return this.major;
    }

    public void setMajor(String major){
        this.major = major;
    }

    @Override
    public void getDisplay(){
        super.getDisplay();
        System.out.println("Major: " + this.major);
        System.out.println("GPA: " + this.GPA);
    }

    public void getDisplay(String Greetings) {
        System.out.println(Greetings);
        getDisplay();
    }
}
