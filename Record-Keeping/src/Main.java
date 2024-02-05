import people.Employee;
import people.Student;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Employee[] dataEmp = new Employee[3];
        Student[] dataStu = new Student[3];

        Random rand = new Random();

        String[] nameList = {"Kevin", "Mao", "Cody", "Nate", "Cindy", "Kailee", "Kate", "Dominic", "Bobby", "Karl"};
        String[] idList = {"1010101010", "2012032012", "245644321", "1230432157", "8472828349", "2381094093", "2101838391"};
        String[] depList = {"CS", "Art", "Engineering", "English", "Science", "Business", "Communications"};

        for(int i = 0; i < dataStu.length;i++){
            dataStu[i] = new Student(nameList[rand.nextInt(nameList.length)], idList[rand.nextInt(idList.length)], depList[rand.nextInt(depList.length)], rand.nextDouble(4.0));
        }

        for(int i = 0; i < dataEmp.length;i++)
        {
            dataEmp[i] = new Employee(nameList[rand.nextInt(nameList.length)], idList[rand.nextInt(idList.length)], depList[rand.nextInt(depList.length)], rand.nextDouble(50000));
        }
    }
}


