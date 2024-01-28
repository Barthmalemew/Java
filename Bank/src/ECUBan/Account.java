package ECUBan;

class Account1 {
    private String ID;
    private String name;
    private double balance;

    public Account1(String ID, String name) {
        this.ID = ID;
        this.name = name;
        balance = 0;

        Bank.addAccount();
    }
}
