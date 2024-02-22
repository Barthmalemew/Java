package Athletes;

class Soccer extends Person {
    int number;
    double kickingPower;

    public Soccer(String name, int grade, int age, String gender, int bannerID, String major, int number, double kickingPower) {
        super(name, grade, age, gender, bannerID, major);
        this.number = number;
        this.kickingPower = kickingPower;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getKickingPower() {
        return kickingPower;
    }

    public void setKickingPower(double kickingPower) {
        this.kickingPower = kickingPower;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println(getNumber() + "\n" + getKickingPower() + "\n");
    }
}
