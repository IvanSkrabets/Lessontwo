public class TaskTwo {
    public static void main(String[] args) {
        int a = 0;
        int b = 1 ;
        int c = 99 ;
        for (int i =1 ;i<=99;i++){
            if (i%2==1){
                a++;
            };
        }
        int [] array = new int [a];
        for (int i =0 ; i < a ; i++) {
            array[i] = b;
            b += 2;
            System.out.print(" " + array[i] + " ");
        }
        System.out.println();
        for (int i =0 ; i < a ; i++) {
            array[i] = c;
            c -= 2;
            System.out.print(" " + array[i] + " ");
        }
    }
}
