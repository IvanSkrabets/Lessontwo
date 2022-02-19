import java.util.Random;

public class TaskEighteen {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(25);
            System.out.print(" " + array[i]);
        }
        System.out.println();
        int a = 0 ;
        for ( int i = 1  ; i < 10 ; i ++ ){
            if (array[ a ] < array [ i ] ){
                a = i ;
            }
        }
        int b = 0 ;
        for ( int i = 1 ; i < 10 ; i ++ ){
            if( array [ b ] < array [ i ] && array [ i ] != array [ a ] ){
                b = i ;
            }
        }
        System.out.println("второй по величине элемент в массиве : " +b+" -- "+array[ b ]);
    }
}
