import java.util.Random;

public class Practice2 {
    public static void main(String[] args) {
        PizzaSelect pizzaSelect = new PizzaSelect();

        pizzaSelect.pick();
    }
}

class PizzaSelect{
    Random rand = new Random();
    int num = rand.nextInt( 5 - 1) + 1;

    void pick(){
        switch(num) {
            case 1, 2:
                System.out.println("Pizza");
                break;
            case 3:
                System.out.println("bibimbap");
                break;
            case 4:
                System.out.println("Couscous");
            break;
        }
    }

}