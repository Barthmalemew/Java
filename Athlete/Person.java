package ECUAthlete;

public class Person
{
    public Person()
    {
        name = "";
        bannerID = "00000000";
    }
    public Person(String name, String ID)
    {
        this.name = name;
        bannerID = ID;
    }
    public final void setName(String name)
    {
        this.name = name;
    }
    public final void setBannerID(String ID)
    {
        bannerID = ID;
    }
    public String getName()
    {
        return name;
    }
    public String getBannerID()
    {
        return bannerID;
    }
    public void displayInfo()
    {
        String secID = bannerID.substring(bannerID.length() - 4);
        System.out.printf("Name: %s\nBannerID: XXXXXX%s\n",name,secID);
    }
    private String name;
    private String bannerID;


}