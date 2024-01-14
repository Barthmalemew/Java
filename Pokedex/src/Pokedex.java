public class Pokedex {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.initBox();
        frame.printBox();
    }
}

class Frame{
    char border = 219;
    int height = 10;
    int width = 20;
    char[][] box = new char[height][width];
    char[][] innerbox = new char[height - 2][width - 2];

    void initBox(){
        for(int row = 0; row < height; row++)
        {
            for(int col = 0; col < width; col++)
            {
                box[row][col] = ' ';

                if(row == height - 1 || col == width - 1 || row == 0|| col == 0)
                {
                    box[row][col] = border;
                }
            }
        }
    }
    void printBox()
    {
        for(int row = 0; row < height; row++)
        {
            for(int col = 0; col < width; col++)
            {
                System.out.print(box[row][col]);
            }
            System.out.println();
        }
    }
}

class Pokemon{
    String Name;
    int weight;
}

