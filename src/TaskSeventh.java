import java.util.Random;

public class TaskSeventh {
    public static void main(String[] args) {
        int [ ] array = new int[ 12 ] ;
        Random random = new Random() ;
        int a = 0 ;
        for (int i = 0; i < 12; i++) {
            array[i] = random.nextInt(15);
            System.out.print("  " + array[i]);
        }
        System.out.println();
        for (int i = 1 ; i < 12 ; i ++ ){
            if (array [ a ]< array[ i ]) {
               a = i ;
            }
        }
        System.out.println("Индекс максимального числа : " +a);
    }
}
