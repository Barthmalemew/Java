import people.Employee;
import people.Student;

public class Main {
    public static void main(String[] args) {
        Employee[] dataEmp = new Employee[3];
        Student[] dataStu = new Student[3];

        for(int i = 0; i < dataStu.length;i++){
            dataStu[0] = new Student("Kevin", "1010101010", "CS", 3.2);
        }
    }
}


