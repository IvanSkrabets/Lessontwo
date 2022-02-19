import java.util.Random;
import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Введите целое четное число : ");
        int a = scanner.nextInt();
        System.out.println(a);
        if ( a % 2 != 0 || a <= 0 ){
            System.out.println("Число неподходящее");
        } else {
            int[] array = new int[a];
            Random random = new Random();
            for (int i = 0; i < a; i++) {
                array[i] = random.nextInt(15);
                System.out.print(" " + array[i]);
            }
            System.out.println();
            int b = 0 ;
            int c = 0 ;
            for (int i = 0 ; i < a / 2 ; i ++ ){
                b += array [i] ;
            }
            System.out.println("сумма левой стороны :  " + b);
            for (int i = a / 2 ; i < a ; i ++){
                c += array [i];
            }
            System.out.println("сумма правой стороны :  " + c);
            if (b > c  ){
                System.out.println("Сумма левой половины массива больше правой");
            }
            if (b < c ){
                System.out.println("Сумма правой половины массива больше левой");
            }
            if (b == c){
                System.out.println("Половины массива равны");
            }
        }
    }
}
