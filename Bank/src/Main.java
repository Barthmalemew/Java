import ECUBan.Account;
import ECUBan.Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int op;
        boolean run = true;

        Bank bank = new Bank();
        Scanner scr = new Scanner(System.in);
        ArrayList<Account> List = new ArrayList<>();

        bank.generateAccount(List);

        while(run) {
            int selected = 4;

            bank.displayAccount(List);
            System.out.println("Number of accounts:" + Bank.getnumAccount());

            System.out.printf("\n%s", "0. Quit\n1. Select Account by ID\n2. Withdraw\n3. Deposit\n4. Total Balance\n");

            op = scr.nextInt();

            switch(op){
                case 1:
                    System.out.println("Select account:");
                    selected = scr.nextInt();
                    break;
                case 2:
                    System.out.println("Enter withdraw amount:");
                    List.get(selected).withdraw(scr.nextDouble());
                    break;
                case 3:
                    System.out.println("Enter deposit amount:");
                    List.get(selected).deposit(scr.nextDouble());
                    break;
                case 4:
                    System.out.println(Bank.getTotalBalance());
                case 0:
                    System.out.println("Goodbye");
                    run = false;
                    break;
            }
            System.out.println(List.get(selected));
        }
    }
}
