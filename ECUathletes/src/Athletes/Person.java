package Athletes;

public class Person {
    public String name;
    public int grade;
    public int age;
    public String gender;
    public int bannerID;
    public String major;

    public Person(){
        name = "";
        grade = 0;
        age = 0;
        gender = "";
        bannerID = 0;
        major = "";
    }
    public Person(String name, int grade, int age, String gender, int bannerID, String major) {
        this.name = name;
        this.grade = grade;
        this.age = age;
        this.gender = gender;
        this.bannerID = bannerID;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getBannerID() {
        return bannerID;
    }

    public String getMajor() {
        return major;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBannerID(int bannerID) {
        this.bannerID = bannerID;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    void getInfo() {
        System.out.println(getName() +
                "\n" + getGrade() +
                "\n" + getAge() +
                "\n" + getGender() +
                "\n" + getBannerID() +
                "\n" + getMajor());
    }
}
