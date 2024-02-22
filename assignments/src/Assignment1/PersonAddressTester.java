package Assignment1;

import java.util.Scanner;

public class PersonAddressTester {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        char choice;

        PersonAddress person1 = new PersonAddress("Kevin", "Rouse", "kevin@gmail.com", "919-223-7265");
        PersonAddress person2 = new PersonAddress("David", "Hart", "David@gmail.com", "222-123-1234");

        person1.displayInfo();
        System.out.println("Change email? y/n");
        choice = scr.next().charAt(0);
        if (choice == 'y')
        {
            person1.setEmail(scr.next());
            scr.nextLine();
        }
        System.out.println("Change phone? y/n");
        choice = scr.next().charAt(0);
        if(choice == 'y')
        {
            person1.setPhone(scr.next());
            scr.nextLine();
        }

        person2.displayInfo();
        System.out.println("Change email? y/n");
        choice = scr.next().charAt(0);
        if (choice == 'y')
        {
            person2.setEmail(scr.next());
            scr.nextLine();
        }
        System.out.println("Change phone? y/n");
        choice = scr.next().charAt(0);
        if(choice == 'y')
        {
            person2.setPhone(scr.next());
            scr.nextLine();
        }

        person1.isEqual(person2);

        scr.close();
    }
}

class PersonAddress{
    String firstName;
    String lastName;
    String email;
    String phone;

    public PersonAddress(){
        firstName = "";
        lastName = "";
        email = "";
        phone = "";
    }

    public PersonAddress(String firstName, String lastName, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public void displayInfo(){
        System.out.printf("\n%s\n%s\n%s\n$%s\n", getFirstName(), getLastName(), getEmail(), getPhone());
    }

    public String setEmail(String inputEmail){
        System.out.println("Enter email address: ");
        return this.email = inputEmail;
    }

    public String setPhone(String inputPhone){
        System.out.println("Enter phone number: ");
        return this.phone = inputPhone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void isEqual(PersonAddress person){
        if(this.firstName.equals(person.firstName))
        {
            System.out.println("Addresses are equal");
        }
        else
        {
            System.out.println("Addresses aren't equal");
        }
    }
}
