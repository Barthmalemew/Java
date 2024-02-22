package Athletes;

class Basketball extends Person {
    int number;
    double height;
    double wingspan;
    double vertical;

    public Basketball(String name, int grade, int age, String gender, int bannerID, String major, int number, double height, double wingspan, double vertical) {
        super(name, grade, age, gender, bannerID, major);
        this.number = number;
        this.height = height;
        this.wingspan = wingspan;
        this.vertical = vertical;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public double getVertical() {
        return vertical;
    }

    public void setVertical(double vertical) {
        this.vertical = vertical;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println(getNumber() + "\n" + getHeight() + "\n" + getWingspan() + "\n" + getVertical());
    }
}
