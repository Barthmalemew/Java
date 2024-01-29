public class Board {

    private final String[][] arr = new String[3][3];

    public void setBoard(String[][] arr){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = "-";
            }
        }
    }

    public void getBoard(String[][] arr){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }
}


