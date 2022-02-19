import java.util.Random;
import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Введите число больше 3 : ");
        int n = scanner.nextInt();
        System.out.println(n);
        int a = 0 ;
        int b = 0 ;
        if ( n <= 3 ){
            System.out.println("Число неподходящее");
        } else {
            int[] array = new int[n];
            Random random = new Random();
            for (int i = 0; i < n; i++) {
                array[i] = random.nextInt(n);
                System.out.print(" " + array[i]);
                if (array[i] % 2 == 0) {
                    a++;
                }
            }
            System.out.println();
            System.out.println("Колличество четных чисел в первом массиве :  " + a);
            int[] onearray = new int[a];
            for (int i = 0; i < n; i++) {
                if (array[i] % 2 == 0){
                    b+=b ;
                    onearray [ b ] = array [i ] ;
                    System.out.print("  "+ onearray [ b ]);
                }
            }
        }
    }
}
