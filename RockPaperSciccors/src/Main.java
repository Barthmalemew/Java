import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player P1 = new Player();
        Player P2 = new Player();
        winner endgame = new winner();

        P1.cryChoice();
        P2.cryChoice();

        P1.battleCryPicker();
        P2.battleCryPicker();

        endgame.P1choice = P1.choice;
        endgame.P2choice = P2.choice;

        endgame.win();
    }
}

class winner{
    int P1choice;
    int P2choice;

    void win() {
        if (P1choice > P2choice || (P1choice == 1 && P2choice == 3)) {
            System.out.println("Player 1 is the Winner!");
        } else if (P1choice == P2choice) {
            System.out.println("It is a draw!");
        } else {
            System.out.println("Player 2 is the Winner!");
        }
    }
}
class Player{
    int choice;
    void cryChoice(){
        System.out.println("Make a Choice");
        System.out.println("1. Rock, 2. Paper, 3. Sciccors");

        Scanner input = new Scanner(System.in);

        choice = input.nextInt();
    }
    void battleCryPicker() {
        switch (choice) {
            case 1:
                System.out.println("""
                        
                            _______
                        ---'   ____)
                              (_____)
                              (_____)
                              (____)
                        ---.__(___)
                        """);
                break;

            case 2:
                System.out.println("""
                        
                             _______
                        ---'    ____)____
                                   ______)
                                  _______)
                                  _______)
                        ---.__________)
                        """);
                break;

            case 3:
                System.out.println("""
                     
                            _______
                        ---'   ____)____
                                  ______)
                               __________)
                              (____)
                        ---.__(___)
                        """);
                break;
        }
    }
}
