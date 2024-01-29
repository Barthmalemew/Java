package ECUBan;

public class Account{
    private String ID;
    private String name;
    private double balance;
    public Account(String ID, String name)
    {
        this.ID = ID;
        this.name = name;
        this.balance = 0.0;

        //calls add account whenever constructor is generated (when new object is made)
        Bank.addAccount();
    }

    public void withdraw(double num){
        if(balance == 0)
        {
            System.out.println("Balance already 0");
        }
        else {
            this.balance -= num;
            Bank.rmTotalBalance(num);
        }
    }

    public void deposit(double num){
        this.balance += num + (num * Bank.getRate());
        Bank.setTotalBalance(num);
    }

    @Override
    public String toString() {
        return "|ID:" + this.ID + "|" + "Name:" + this.name + "\n"
                + "|Balance:$" + this.balance + "\n";
    }
}