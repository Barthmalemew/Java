package Athletes;

public class TennisTeams {
    int numPlayers;
    int capacity;

    public TennisTeams(){
        numPlayers = 2;
        capacity = 5;
    }

    Tennis[] team = new Tennis[capacity];
    public int getNumPlayers() {
        return numPlayers;
    }

    public void getTeam() {
        for (int i = 0; i < team.length; i++) {
            team[i].getInfo();
        }
        System.out.println("capacity: " + getCapacity());
        System.out.println("number of players: " + getNumPlayers());
    }

    public int getCapacity() {
        return capacity;
    }

    public void removeAthlete(int n){
        team[n] = null;
    }

    public void addAthlete()
    {
        for(int i = 0; i < capacity; i++) {
            team[i] = new Tennis();
        }
    }
}
