import java.util.Random;

public class TaskFive {
    public static void main(String[] args) {
        double b = 0 ;
        double c = 0 ;
        int[] onearray = new int[5];
        Random a = new Random();
        for (int i = 0; i < 5; i++) {
            onearray[i] = a.nextInt(15);
            System.out.print("  " + onearray[i]);
        }
        System.out.println();
        int[] secondarray = new int[5];
        for (int  i= 0; i < 5; i++) {
            secondarray[i] = a.nextInt(15);
            System.out.print("  " + secondarray[i]);
        }
        System.out.println();
        for (int  i= 0; i < 5; i++){
            b += onearray[i] ;
            c += secondarray[i] ;
        }
        System.out.println(b / 5 + "   "+ c / 5);
        if (b / 5 > c / 5 ) {
            System.out.println("Среднее арифметическое 1-го массива больше второго");
        }
        if (b / 5 < c / 5 ) {
            System.out.println("Среднее арифметическое 2-го массива больше первого");
        }
        if (b / 5 == c / 5){
            System.out.println("Среднее арифметическое 2-x массивов равно");
        }
    }
}
