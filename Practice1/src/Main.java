import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TwoInts one = new TwoInts();
        TwoDoubles two = new TwoDoubles();
        TwoWords three = new TwoWords();
        TwoSentence four = new TwoSentence();

        one.getNum();
        two.getNumDoub();
        three.getWord();
        four.getSent();
    }
}

class TwoInts{
    int num1;
    int num2;

    Scanner scr = new Scanner(System.in);

    void getNum(){
        System.out.println("Enter two integers:");

        num1 = scr.nextInt();
        num2 = scr.nextInt();

        System.out.println("The two integers you entered are: " + num1 + " and " + num2);
    }
}

class TwoDoubles {
    double num1;
    double num2;

    void getNumDoub() {
        System.out.println("Enter two doubles:");
        Scanner scr = new Scanner(System.in);
        num1 = scr.nextDouble();
        num2 = scr.nextDouble();

        System.out.println("The two double numbers you entered are: " + num1 + " and " + num2);
    }
}

class TwoWords {
    String wordOne;
    String wordTwo;

    void getWord() {

        System.out.println("Enter two words:");
        Scanner scr = new Scanner(System.in);
        wordOne = scr.next();
        wordTwo = scr.next();

        System.out.println("The two words you entered are: " + wordOne + " and " + wordTwo);
    }
}

class TwoSentence {
    String sentOne;
    String sentTwo;

    void getSent() {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter your first sentence: ");
        sentOne = scr.nextLine();

        System.out.println("Enter your second sentence: ");
        sentTwo = scr.nextLine();

        System.out.println("The first sentence you entered is: " + sentOne);
        System.out.println("The second sentence you entered is: " + sentTwo);
    }
}