package D3_Donguler;
/*
Java döngüler ile negatif bir değer girilene kadar kullanıcıdan
girişleri kabul eden ve girilen değerlerden tek sayıları
toplayıp ekrana basan programı yazıyoruz.

Ödev

Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri
 kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları
  toplayıp ekrana basan programı yazıyoruz.

 */

import java.util.Scanner;

public class P2_TekSayilarinToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi = 0, tekSayiToplami = 0, toplam = 0;
        /*do {
            System.out.println("Sayi giriniz \t\t Cikmak icin -1 girin :");
            sayi = input.nextInt();
            if (sayi % 2 != 0 && sayi > 0) {
                System.out.println(sayi + " bir tek sayi");
                tekSayiToplami += sayi;
            }

        } while (sayi >= 0);
        System.out.println("Girilen tek sayilarin toplami = " + tekSayiToplami);

         */

        do {
            System.out.println("Sayi giriniz \t\t Cikmak icin tek sayi girin :");
            sayi = input.nextInt();
            if (sayi % 4 == 0) {
                toplam += sayi;
                System.out.println(sayi + " sayisi 4'un katidir.");
            }
        } while (sayi % 2 == 0);

        System.out.println("4'un kati olan sayilarin toplami = "+toplam);

    }
}
