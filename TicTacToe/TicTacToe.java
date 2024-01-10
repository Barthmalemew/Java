import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args)
    {
        int row;
        int col;

        boolean winner = false;

        char[][] board = new char[4][4];

        Scanner player = new Scanner(System.in);

        initialize(board);

        do{
            System.out.print("PLayer 1, what row would you like to place your token: ");
            row = player.nextInt();
            System.out.print("what column would you like to place your token on: ");
            col = player.nextInt();

            if(occupied(board,row,col))
                board[row][col] = 'X';

            print(board);

            if(matchover(board))
            {
                winner = true;
            }

            System.out.print("PLayer 2, what row would you like to place your token: ");
            row = player.nextInt();
            System.out.print("what column would you like to place your token on: ");
            col = player.nextInt();

            if(occupied(board, row, col))
                board[row][col] = 'O';

            print(board);

            if(matchover(board))
            {
                winner = true;
            }
        }
        while(!winner);

        System.out.println("Game Over");
    }
    public static boolean occupied(char[][] board, int row, int col)
    {
        if(board[row][col] != '-')
        {
            return false;
        }
        else return true;
    }

    public static void initialize(char[][] board)
    {
        for(int x = 1; x <= 3; x++)
        {
            for(int y = 1; y <= 3; y++)
            {
                board[x][y] = '-';
            }
        }
    }

    public static void print(char[][]board)
    {
        for(int x = 1; x <= 3; x++)
        {
            for(int y = 1; y <= 3; y++)
            {
                System.out.print(board[x][y]);
            }
            System.out.println();
        }
    }

    public static boolean matchover(char[][]board)
    {
        if(board[1][1] == board[1][2] && board[1][1] == board[1][3])
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
