import java.util.Random;

public class TaskFourteen {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(25);
            System.out.print(" " + array[i]);
        }
        System.out.println();
        int a = 1 ;
        for (int i = 1 ; i < 9 ; i += 2 ){
            if (array [ a ] > array[ i +2 ]){
            }else {
                a = i + 2;
            }
        }
        System.out.println("наименьший нечетный элемент массива : "+ a +"-"+ array [ a ]);
    }
}
