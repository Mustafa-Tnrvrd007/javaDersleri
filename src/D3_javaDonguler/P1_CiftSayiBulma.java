package D3_javaDonguler;
/*
Java döngüler ile kullanıcının girdiği sayıya kadar
çift olan sayıları bulan programı yazıyoruz

Ödev
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e
 tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
 */

import java.util.Scanner;

public class P1_CiftSayiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi girin : ");
        int sayi = input.nextInt(), toplam = 0, sayac = 0;


        for (int i = 1; i <= sayi; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ,");
            }
        }

        for (int j = 1; j < sayi; j++) {
            if (j % 3 == 0 && j % 4 == 0) {
                System.out.println(j + " sayisi 3 ile 4'un ortak katıdır.");
                toplam += j;
                sayac++;
            }
        }
        System.out.println("3'e ve 4'e bolunebilen sayilarin ortalamasi = " + (toplam / sayac));


    }
}
