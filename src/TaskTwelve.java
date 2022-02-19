import java.util.Random;

public class TaskTwelve {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(25);
            System.out.print(" " + array[i]);
        }
        System.out.println();
        double a = 0 ;
        for (int i = 1; i < 10; i += 2){
            a+=array [ i];
        }
        System.out.println("Среднее арифметическое всех элементов с нечетными номерами : "+ a/5);
    }
}
