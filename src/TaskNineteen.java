import java.util.Random;

public class TaskNineteen {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(25);
            System.out.print(" " + array[i]);
        }
        System.out.println();
        int a = 0 ;
        for (int i = 2; i < 10; i+=2 ){
            if (array[ a ] < array [ i ] ){
                a = i ;
            }
        }
        System.out.println("наименьший элемент среди элементов с четными индексами массива : "+a+ "--"+array[a]);
    }
}
