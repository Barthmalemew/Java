package ECUAthlete;

public class TennisTeam
{
    /**
     * The constructor for this class us purely used to initialize the array for the objects created by this class but not to assign any values or create the objects of the TennisPlayer class in the array
     * The creation of TennisPlayer objects in the players array will be handled by the addMember method
     */
    public TennisTeam()
    {
        this.players = new TennisPlayer[TennisTeam.CAPACITY];
        currentNum = 0;
    }

    public void addMember(TennisPlayer newPlayer)
    {
        if(currentNum < CAPACITY)
        {
            this.players[currentNum] = newPlayer;
            currentNum++;
            System.out.println("Player successfully added");
        }
        else
        {
            System.out.println("Could not add player, the team is full");
        }
    }

    /**
     *  This method makes adds a member to the tennis team by creating a new TennisPlayer object with the values being the parameters for the method
     * @param name A String containing the players name
     * @param ID A String containing the players bannerId
     * @param age an integer containing the players age
     * @param gender A String containing the players gender
     * @param major A String containing the players major
     * @param skillLevel An integer containing the players skill level
     * @param hitAccuracy A double containing the players accuracy
     */
    public void addMember(String name, String ID,int age, String gender, String major,int skillLevel, double hitAccuracy)
    {
        if(currentNum < CAPACITY)
        {
            if(hitAccuracy <= 1.0)
            {
                hitAccuracy = hitAccuracy * 100;
            }
            this.players[currentNum] = new TennisPlayer(name,ID,age,gender,major,skillLevel,hitAccuracy);
            currentNum++;
            System.out.println("Player successfully added");
        }
        else
        {
            System.out.println("Could not add player, the team is full");
        }
    }
    public void removePlayer(String bID)
    {
        int indexToBeRemoved = -1;
        for(int i = 0; i < currentNum; i++)
        {
            if(bID.equalsIgnoreCase(this.players[i].getBannerID()))
            {
                indexToBeRemoved = i;
                break;
            }
        }
        for(int i = indexToBeRemoved; i < currentNum;i++)
        {
            this.players[i] = this.players[i+1];
        }
        if(indexToBeRemoved >= 0)
        {
            this.currentNum -= 1;
            System.out.println("Player removed successfully");
        }
        else
        {
            System.out.println("Could not find player to be removed");
        }
    }
    public void displayInfo(int plyrNum)
    {
        try {
            this.players[plyrNum].displayInfo();
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("The position number you entered does not correspond to a player");
        }
    }
    public void displayTeamInfo()
    {
        for(int i = 0; i < currentNum; i++)
        {
            this.players[i].displayInfo();
        }
        System.out.printf("The current number of players on this team: %d\n",currentNum);
    }
    public int getCapacity()
    {
        return CAPACITY;
    }
    public int getCurrentNum()
    {
        return currentNum;
    }
    private TennisPlayer[] players;
    private static final int CAPACITY = 15;
    private int currentNum;



    public static void main(String[] args)
    {
        TennisTeam test = new TennisTeam();
        TennisPlayer testPlayer = new TennisPlayer("john","B0002453", 21, "male","Buissness Managment", 60, .705);
        test.addMember(testPlayer);
        test.displayTeamInfo();
        test.addMember("David","B0023525",20,"male","Accounting",50,65.6);
        test.displayInfo(1);
        test.addMember("josh","B0011111",20,"male","Art",80,81.4);
        test.addMember("rebecca","B0111322",22,"female","Engineering",93,94.5);
        TennisPlayer player3 = new TennisPlayer();
        player3.setName("richard");
        player3.setBannerID("B0023431");
        player3.setAge(23);
        player3.setGender("male");
        player3.setMajor("Hospitality");
        player3.setSkillLevel(88);
        player3.setAccuracy(90.0);
        test.addMember(player3);
        test.displayTeamInfo();
        player3.swing();
        test.addMember("robert","B0111252",22,"male","Engineering",50,44.5);
        test.displayTeamInfo();
        test.removePlayer("B0111252");
        test.displayTeamInfo();
    }
}
