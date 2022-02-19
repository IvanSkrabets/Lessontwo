import java.util.Random;

public class TaskFour {
    public static void main(String[] args) {
        int [] array = new int [ 20 ] ;
        Random random = new Random() ;
        for (int i = 0 ; i < 20 ; i++) {
            array [ i ] =   random.nextInt(20) ;
            System.out.print("  " + array [ i ]);
        }
        System.out.println();
        for (int i = 0 ; i < 20 ; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
            System.out.print("  " + array[i]);
        }
    }
}
