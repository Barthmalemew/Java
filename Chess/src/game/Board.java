package game;


public class Board {

    public static final String EMPTY = "-";
    public static String[][] board = new String[8][8];

    public void initBoard(){
        for(int i = 0; i < 8; i++)
        {
            for(int j = 0; j < 8; j++)
            {
                board[i][j] = EMPTY;
            }
        }
    }
    public void printBoard(){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }

}
