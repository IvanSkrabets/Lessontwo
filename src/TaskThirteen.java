import java.util.Random;

public class TaskThirteen {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(25);
            System.out.print(" " + array[i]);
        }
        System.out.println();
        int b = 0 ;
        int c = 5 ;
        double a = 0 ;
        for (int i = 0; i < 10; i ++ ){
            if (array [ i] > c ){
                a+=array [ i];
                b++ ;
            }
        }
        System.out.println("Среднее арифметическое всех элементов больше "+ c +" : "+ a / b);
    }
}
