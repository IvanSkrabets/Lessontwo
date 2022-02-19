import java.util.Random;

public class TaskEleven {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(25);
            System.out.print(" " + array[i]);
            }
        System.out.println();
        int a = 1 ;
        for (int i = 0; i < 10; i++){
            if (array [ i ]%3 == 0 && array [ i ] != 0 ){
                a = array [ i ] * a;
            }
        }
        System.out.println("произведение элементов, кратных 3 :" + a);
        }
    }
