import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n;

        try{
            if(n < 0)
            {
                throw new Exception("you ,,");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    static void Factorial(){
        
    }
}