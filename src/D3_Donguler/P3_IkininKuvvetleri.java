package D3_Donguler;
/*
Java döngüler ile girilen sayıya kadar olan 2'nin
kuvvetlerini ekrana yazdıran programı yazıyoruz.

*/

import java.util.Scanner;

public class P3_IkininKuvvetleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi girin : ");
        /*
        int sayi= input.nextInt(),ikininKuvveti=1,kuvvetSayac=0;


        do {
            System.out.println("2^"+kuvvetSayac+" = "+(ikininKuvveti));
            ikininKuvveti *=2;
            kuvvetSayac++;


        } while (ikininKuvveti<=sayi);

         */
        /*
        Odev

            Java döngüler ile girilen sayıya kadar olan 4 ve 5'in
            kuvvetlerini ekrana yazdıran programı yazıyoruz.
         */
        int number = input.nextInt();

        for (int i = 1, j = 1; i <= number; i *= 4, j *= 5) {

            System.out.print(i + "\t\t");

            if (j<=number){
                System.out.println(j);
            }

        }


    }
}
