import java.util.Random;

public class TaskThree {
    public static void main(String[] args) {
        int a = 0 ;
        int [] array = new int [ 15 ] ;
        Random random = new Random() ;
        for (int i = 0 ; i < 15 ; i++) {
            array [ i ] =   random.nextInt(99) ;
            System.out.print("  " + array [ i ]);
        }
        System.out.println();
        for (int i = 0 ; i < 15 ; i++){
            if(array[ i ] % 2 == 0){
                a ++ ;
            }
        }
        System.out.println(a);
    }
}
