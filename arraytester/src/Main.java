public class Main {
    public static void main(String[] args) {
        int[] temp = new int[101];
        int[] test = new int[]{1,2,2,2,3};

        for(int i: test){
            temp[i]++;
        }

        for(int j: temp){
            System.out.print(j);
        }
    }
}