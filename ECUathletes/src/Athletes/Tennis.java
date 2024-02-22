package Athletes;

class Tennis extends Person {
    double hittingPower;

    public Tennis(String name, int grade, int age, String gender, int bannerID, String major, double hittingPower){
        super(name, grade, age, gender, bannerID, major);
        this.hittingPower = hittingPower;
    }

    public Tennis() {
        hittingPower = 0;
    }

    public double getHittingPower() {
        return hittingPower;
    }

    public void setHittingPower(double hittingPower) {
        this.hittingPower = hittingPower;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println(getHittingPower());
    }
}
