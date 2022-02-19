import java.util.Random;

public class TaskSix {
    public static void main(String[] args) {
        int [ ] array = new int[ 4 ] ;
        Random random = new Random() ;
        int b = 0 ;
        for (int i = 0; i < 4; i++) {
            array[i] = random.nextInt(10);
            System.out.print("  " + array[i]);
        }
        for (int i = 0; i < 3; i++) {
            if (array[i]< array[i+1]){
                b++ ;
            }
        }
        System.out.println();
        if (b == 4){
            System.out.println("Последовательность строго возврастающая");
        }
    }
}
