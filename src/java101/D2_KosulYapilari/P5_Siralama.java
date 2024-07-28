package java101.D2_KosulYapilari;

import java.util.Scanner;

public class P5_Siralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("Birinci sayiyi gir");
        a = input.nextInt();
        System.out.println("Ikincci sayiyi gir");
        b = input.nextInt();
        System.out.println("Ucuncu sayiyi gir");
        c = input.nextInt();

        /*
        a>b     ,   a>c
        b>a     ,   b>c
        c>a     ,   c>b

        iki sayi birbirine eşit olabilir
        üç sayı da birbirine eşit olabilir

         */

        if (a > b && a > c) {
            System.out.println("en buyuk a");
            if (b>c) System.out.println("a>b>c");
            else if (c>b) System.out.println("a>c>b");
            else System.out.println("a>b=c");

        } else if (b > a && b > c) {
            System.out.println("en buyuk b");
            if (a>c) System.out.println("b>a>c");
            else if (c>a) System.out.println("b>c>a");
            else System.out.println("b>a=c");

        } else if (c > a && c > b) {
            System.out.println("en buyuk c");
            if (a>b) System.out.println("c>a>b");
            else if (b>a) System.out.println("c>b>a");
            else System.out.println("c>a=b");

        } else {
            System.out.println("Uc sayi da birbirine esit\na=b=c");
        }

    }
}
