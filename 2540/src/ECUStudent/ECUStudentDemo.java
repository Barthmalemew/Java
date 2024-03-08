package ECUStudent;

public class ECUStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ECUStudent Student1 = new ECUStudent("1010AB", "Kevin", 87, 90);
		ECUStudent Student2 = new ECUStudent("2020CD", "David", 70, 80);
		Student1.getInfo();
		Student2.getInfo();
	}
}

class ECUStudent{
	String ID;
	String name;
	int midtermgrade;
	int finalgrade;
	double gpa;
	
	public ECUStudent() {
		ID = "";
		name = "";
		midtermgrade = 0;
		finalgrade = 0;
		gpa = 0.0;
	}
	
	public ECUStudent(String ID, String name, int midtermgrade, int finalgrade) {
		this.ID = ID;
		this.name = name;
		this.midtermgrade = midtermgrade;
		this.finalgrade = finalgrade;
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public String getID() {
		return ID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setMidTermGrade(int midtermgrade) {
		this.midtermgrade = midtermgrade;
	}
	
	public int getMidTermGrade() {
		return midtermgrade;
	}
	
	public int getFinalGrade() {
		return finalgrade;
	}
	
	public void setFinalGrade(int finalgrade) {
		this.finalgrade = finalgrade;
	}

	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
		
	public double getGPA() {
		gpa = (double) (midtermgrade + finalgrade) / 2;
		return gpa;
	}
	
	public void getInfo() {	
		System.out.println( "ID: " + getID() + "\n" +
							"Name: " + getName() + "\n" +
							"Midterm Grade: " + getMidTermGrade() + "\n" + 
							"Final Grade: " + getFinalGrade() + "\n" + 
							"GPA: " + getGPA() + "\n");
	}
}
