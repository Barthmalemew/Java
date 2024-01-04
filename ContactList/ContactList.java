import java.util.Scanner;

public class ContactList {
    public static void main(String[] args)
    {
        Contact one = new Contact();
        one.getContact();
        Contact two = new Contact();
        two.getContact();
        Contact three = new Contact();
        three.getContact();

        int op;
        Scanner sc = new Scanner(System.in);
        op = sc.nextInt();

        System.out.println("Select Contact");

        switch(op) {
            case 1:
                one.printContact();
                break;
            case 2:
                two.printContact();
                break;
            case 3:
                three.printContact();
                break;
        }
    }
}



class Contact{

    String name;
    int age;

    void printContact(){
        System.out.printf("%s\n%d", name, age);
    }

    void getContact(){
        System.out.println("Enter Contact Info");

        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        age = input.nextInt();
    }
}

