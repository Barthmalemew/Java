import java.util.Scanner;

public class Player {
    private int x;
    private int y;

    private int id;

    Scanner scr = new Scanner(System.in);

    public Player(int id){
        x = 0;
        y = 0;
    }

    public void setPlayer(String[][] arr){
       x = scr.nextInt();
       y = scr.nextInt();

       if(this.id == 1)
       {
           arr[x][y] = "X";
       }
       if(this.id == 2)
       {
           arr[x][y] = "O";
       }
    }

}
