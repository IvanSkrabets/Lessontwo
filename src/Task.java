public class Task {
    public static void main(String[] args) {
        int a = 0 ;
        int b =2 ;
        int c = 2;
        for (int i =0 ;i<20;i++){
            if (i%2==0){
                a++;
            };
        }
//        System.out.println(a);
        int [] array = new int [a] ;
        for ( int i=0 ; i < a ; i++) {
            array [i] = b;
            b+=2 ;
            System.out.println(array[i]);
        }
        for ( int i=0 ; i <10 ; i++) {
            array[i] = c;
            c += 2;
            System.out.print(" "+array[i]+" ");
        }
    }
}
