import java.util.Random;

public class TaskEighth {
    public static void main(String[] args) {
        int[] onearray = new int[10];
        Random a = new Random();
        for (int i = 0; i < 10; i++) {
            onearray[i] = a.nextInt(9);
            System.out.print("  " + onearray[i]);
        }
        System.out.println();
        double[] secondarray = new double[10];
        for (int  i= 0; i < 10; i++) {
            secondarray[i] = a.nextInt(9);
            System.out.print("  " + secondarray[i]);
        }
        System.out.println();
        double[] threearray = new double[10];
        for (int  i= 0; i < 10; i++) {
            threearray[i] = onearray[i] / secondarray[i];
            System.out.print("  " + threearray[i]);
        }
        int b = 0 ;
        for (int  i= 0; i < 10; i++) {
            if (threearray[i] - (int)threearray[i] == 0) {
                b++;
            }
        }
        System.out.println();
            System.out.println(" В третьем массиве целых чисел : " + b);
    }
}
