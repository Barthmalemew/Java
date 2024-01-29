import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setID();
        student1.setName();
        student1.setGrades();
        student1.setGPA();

        student2.setID();
        student2.setName();
        student2.setGrades();
        student2.setGPA();

        System.out.printf("Student ID: %d Student name: %s Student GPA: %s \n", student1.id, student1.name, student1.gpaLetter);

        System.out.printf("Student ID: %d Student name: %s Student GPA: %s \n", student2.id, student2.name, student2.gpaLetter);
    }
}

class Student{
    int id;
    String name;
    double midTermGrade;
    double finalGrade;
    double gpa;
    char gpaLetter;
    Scanner scr = new Scanner(System.in);
    Student(){
        id = 0;
        name = " ";
        midTermGrade = 0;
        finalGrade = 0;
        gpa = 0;
        gpaLetter = ' ';
    }
    public void setID(){
        System.out.print("Enter the Student's ID: ");
        id = scr.nextInt();
        scr.nextLine();
    }
    public void setName(){
        System.out.print("Enter the Student's name: ");
        name = scr.nextLine();
    }

    public void setGrades(){
        System.out.print("Enter the midterm grade: ");
        midTermGrade = scr.nextDouble();

        System.out.print("Enter the final Grade: ");
        finalGrade = scr.nextDouble();

    }

    public void setGPA(){
        gpa = (midTermGrade + finalGrade) / 2;

        if (gpa >= 90)
        {
            gpaLetter = 'A';
        }
        else if (gpa >= 80)
        {
            gpaLetter = 'B';
        }
        else if (gpa >= 70)
        {
            gpaLetter = 'C';
        }
        else if (gpa >= 60)
        {
            gpaLetter = 'D';
        }
        else
        {
            gpaLetter = 'F';
        }
    }
}