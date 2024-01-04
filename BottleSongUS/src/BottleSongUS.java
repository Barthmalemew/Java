public class BottleSongUS
{
    public static void main(String[] args)
    {
        int bottle = 99;

        String plural = " bottles";

        while(bottle > 0)
        {
            if (bottle == 1)
                plural = " bottle";

            System.out.println(bottle + plural + " of beer on the wall, " + bottle + plural + " of beer.");

            bottle--;

            if(bottle > 0)
            {
                System.out.println("Take one down and pass it around, " + bottle + plural + " of beer on the wall.");
            }
            else
            {
                System.out.println("Take one down and pass it around, no more bottles of beer on the ground.");
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
                System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
            }
        }
    }
}