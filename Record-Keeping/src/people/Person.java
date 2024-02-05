package people;

public class Person {
    String name;
    String BannerID;

    public Person()
    {
        name = "NA";
        BannerID = "NA";
    }

    public Person(String name, String BannerID){
        this.name = name;
        this.BannerID = BannerID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setBannerID(String BannerID)
    {
        this.BannerID = BannerID;
    }
    public String getBannerID() {
        return this.BannerID;
    }

    public void getDisplay(){
        System.out.println("Name: " + name);
        System.out.println("BannerID: XXXXXX" + BannerID.substring(5 , BannerID.length() - 1));
    }
}
