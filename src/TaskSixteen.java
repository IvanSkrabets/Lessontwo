import java.util.Random;

public class TaskSixteen {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(25);
            System.out.print(" " + array[i]);
        }
        System.out.println();
        int b = 0 ;
        for (int a = 0; a < 10; a++) {
            for (int i = a + 1 ; i < 10; i++) {
                if (array[a] == array[ i ]){
                    b++ ;
                }
            }
        }
        if (b == 0 ){
            System.out.println("Все элементы разлличны");
        } else {
            System.out.println("Элементы массива не различны");
        }
    }
}
