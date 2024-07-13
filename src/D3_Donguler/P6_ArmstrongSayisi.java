package D3_Donguler;
/*
N haneli bir sayının basamaklarının n’inci üstlerinin toplamı,
sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) =
64+0+343 = 407 sonucunu verir. Bu da 407 sayısının
armstrong bir sayı olduğunu gösterir.

1342 sayısına da bakalım.
(1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı
1342’ye eşit olmadığı için armstrong sayı olmaz.
 */

import java.util.Scanner;

public class P6_ArmstrongSayisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayi girin :");
        int sayi = input.nextInt();

        // sayiyi basamaklarina ayirmak lazim
        // sayi kaç basamakli ?
        int basamakSayisi = 0, enBuyukBasamakDegeri = 1, deger = sayi;
         // hem sayi ile işlem yapipp hem onu
        // tutmak için deger degiskenine atadık

        while (deger > 0) { // sayinin kaç basamaklı oldugunu bulduk
            deger /= 10; // sayiyi 10'a bolerek 1 basamak dusurduk
            basamakSayisi++;
        }

        for (int i = 1; i < basamakSayisi; i++) {
            // sayinin 10'luk tabandaki
            // en buyuk basamak degerini bulduk
            enBuyukBasamakDegeri *= 10;
        }

        System.out.println("basamak sayisi = " + basamakSayisi + "\nbasamak degeri = " + enBuyukBasamakDegeri);

        /// basamak sayisini ve en buyuk basamak degerini bulduk

        // basamak sayilarini ayiklama
        int oAnkiBasamak, usslerToplami = 0, ussDegeri;
        deger = sayi; // sayi ile tekrar işlem yapmak için
        while (enBuyukBasamakDegeri > 0) {
            // her bir basamaktaki degerleri oAnkiBasamak degiskenine atadık
            oAnkiBasamak = deger / enBuyukBasamakDegeri;
            System.out.println("Sayinin basamaklari = " + oAnkiBasamak);
            deger = deger % enBuyukBasamakDegeri; // işlem yaptıktan sonra
            // sayinin en buyuk basamagini yok etmek için
            enBuyukBasamakDegeri /= 10; // basamak degerini 1 dusurduk
            ussDegeri = 1; // buldugumuz basamak sayilarinin usslerini toplamak için
            for (int i = 0; i < basamakSayisi; i++) {// uss degeri = basamak sayisi
                ussDegeri *= oAnkiBasamak; // oAnkiBasamak = taban
            }
            usslerToplami += ussDegeri;
        }

        System.out.println("Ussler Toplami = " + usslerToplami + " sayi = " + sayi);
        if (sayi == usslerToplami) {
            System.out.println(sayi + " sayisi bir Armstrong sayisidir.");
        } else {
            System.out.println(sayi + " sayisi bir Armstrong sayi degildir.");
        }


    }
}
