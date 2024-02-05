package ECUBan;

import java.util.ArrayList;
import java.util.Random;

public class Bank {
    private static double rate = 0.1;
    private static int numAccount = 0;
    private static double totalBalance = 0;

    public Bank(){
        rate = 0.1;
        numAccount = 0;
        totalBalance = 0;
    }

    public static double getRate()
    {
        return rate;
    }

    public static double getnumAccount(){
        return numAccount;
    }

    public static double getTotalBalance(){
        return totalBalance;
    }
    public static void addAccount()
    {
        numAccount++;
    }

    public static void setTotalBalance(double num)
    {
        totalBalance += num;
    }

    public static void rmTotalBalance(double num){
        totalBalance -= num;
    }

    public void generateAccount(ArrayList<Account> List){
        Random rand = new Random();

        String[] nameList = {"Kailee", "Nate", "David", "Sofia", "Mao", "Matt", "Kevin", "Jimmy", "Jennifer", "Bobby", "Gopal"};

        for(int i = 0; i < rand.nextInt(10) + 4; i++) {
            List.add(new Account("0" + i, nameList[rand.nextInt(nameList.length)],Math.floor((rand.nextDouble(1000)) * 100) / 100.0));
        }
    }

    public void displayAccount(ArrayList<Account> List) {
        for (Account s: List) {
            System.out.print(s);
        }
    }
}
