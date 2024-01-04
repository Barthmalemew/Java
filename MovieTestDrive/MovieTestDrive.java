import java.util.Scanner;

public class MovieTestDrive {
    public static void main(String[] args)
    {
        Movie one = new Movie();
        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Lost in Cubicle Space";
        two.genre = "Comedy";
        two.rating = 5;
        Movie three = new Movie();
        three.title = "Byte Club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;

        System.out.println("select movie");

        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();

        switch(op)
        {
            case 1:
                one.playIn();
                break;
            case 2:
                two.playIn();
                break;
            case 3:
                three.playIn();
                break;
        }
    }
}

class Movie{
    String title;
    String genre;
    int rating;

    void playIn() {
        System.out.printf("%s\n%s\n%d", title, genre, rating);
    }
}
