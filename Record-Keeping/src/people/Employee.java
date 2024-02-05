package people;

public class Employee extends Person {
    String dept;
    double salary;

    public Employee() {
        super();
        dept = "NA";
        salary = 0;
    }

    public Employee(String name, String BannerID, String dept, double salary){
        super(name, BannerID);
        this.dept = dept;
        this.salary = salary;
    }
    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDept(){
        return this.dept;
    }

    @Override
    public void getDisplay(){
        super.getDisplay();
        System.out.println("Department: " + this.dept);
        System.out.println("Salary: " + this.salary);
    }

    public void getDisplay(String Greetings){
        System.out.println(Greetings);
        getDisplay();
    }
}
