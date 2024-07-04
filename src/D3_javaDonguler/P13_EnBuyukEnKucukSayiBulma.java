package D3_javaDonguler;
/*
Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük
sayıları bulan ve bu sayıları ekrana yazan programı yazın.

Senaryo
Kaç tane sayı gireceksiniz: 4
1. Sayıyı giriniz: 16
2. Sayıyı giriniz: -22
3. Sayıyı giriniz: -15
4. Sayıyı giriniz: 100
En büyük sayı: 100
En küçük sayı: -22
 */

import java.util.Scanner;

public class P13_EnBuyukEnKucukSayiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int enKucuk, enBuyuk=0, sayi,donguSayisi;
        System.out.println("Kac tane sayi gireceksiniz");
        donguSayisi = input.nextInt();
        System.out.println("Sayi girin : ");
        sayi= input.nextInt();
        enKucuk =sayi;
        enBuyuk = sayi;

        for (int i = 1; i < donguSayisi; i++) {
            System.out.println("Sayi girin : ");
            sayi= input.nextInt();
            if (sayi<=enKucuk){
                enKucuk = sayi;
            }
            if (sayi>=enBuyuk){
                enBuyuk=sayi;
            }

        }

        System.out.println("En kucuk sayi : "+enKucuk+"\nEn buyuk sayi : "+enBuyuk);

    }
}
