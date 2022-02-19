import java.util.Random;

public class TaskSeventeen {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(6);
            System.out.print(" " + array[i]);
        }
        System.out.println();
        int b = 0 ;
        int c = 5 ;
        for (int i = 0; i < 10; i++){
            if ((double)array[i] / c == 1){
                b++ ;
            }
        }
        System.out.println("Число "+ c + "  встречается в массиве : "+ b);
    }
}
