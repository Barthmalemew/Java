public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Player player1 = new Player(1);
        Player player2 = new Player(2);

        String[][] playboard = new String[3][3];

        board.setBoard(playboard);
        board.getBoard(playboard);


    }
}
