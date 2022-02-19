import java.util.Random;

public class TaskFifteen {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(25);
            System.out.print(" " + array[i]);
        }
        System.out.println();
        for (int i = 0 ; i < 10 ; i ++){
            if (i%2 == 0){
                array [ i ] = 0 ;
            }
            System.out.print(" " + array[i]);
        }
    }
}
