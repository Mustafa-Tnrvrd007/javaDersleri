package D4_Metotlar;
/*
fibonacci serisi
1 1 2 3 5 8 13 21
 */

public class P2_RecursiveFibonacci {
    static int fibonacci (int number){

        if (number==0 || number==1)
            return 1;
        else
            return fibonacci(number-1)+fibonacci(number-2);

    }
    public static void main(String[] args) {
        fibonacci(6);
    }
}
