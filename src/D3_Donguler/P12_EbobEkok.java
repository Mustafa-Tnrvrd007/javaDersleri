package D3_Donguler;
/*
EBOB : İki ya da daha fazla doğal sayının ortak bölenlerinin
en büyüğüne bu sayıların en büyük ortak böleni, kısaca EBOB‘u denir.

ÖRNEK: 18 ve 24 sayılarının en büyük ortak bölenini adım adım bulalım.
18’in bölenleri : 1, 2, 3, 6, 9, 18
24’ün bölenleri : 1, 2, 3, 4, 6, 8, 12, 24
Bu ortak bölenlerin en büyüğü 6 sayısı EBOB’tur.
 */
/*
EKOK : İki ya da daha fazla doğal sayının ortak katlarının
en küçüğüne bu sayıların en küçük ortak katı, kısaca EKOK‘u denir.

ÖRNEK: 6 ve 8 sayılarının en küçük ortak katını adım adım bulalım.
6’nın katları : 6, 12, 18, 24, 30, 36, 42, 48, …
8’in katları : 8, 16, 24, 32, 40, 48, 56, 64, …
Bu ortak katlardan en küçüğü 24 sayısı EKOK’tur.
EKOK = (n1*n2) / EBOB
Ödev
Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
 */

import java.util.Scanner;

public class P12_EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2,  ebob = 1, ekok = 1,sayac=1;
        // sayilari kullanicidan aldik
        System.out.println("Birinci sayiyi girin : ");
        sayi1 = input.nextInt();
        System.out.println("Ikinci sayiyi girin : ");
        sayi2 = input.nextInt();

        while (sayac <sayi1){
            if (sayi1 % sayac == 0 && sayi2 % sayac == 0) {
                ebob = sayac;
            }
            sayac++;
        }
        System.out.println("Girdiginiz sayilarin EBOB\'u : " + ebob);

//        for (int i = 1; i <= sayi1; i++) {
//
//            if (sayi1 % i == 0 && sayi2 % i == 0) {
//                ebob = i;
//            }
//
//        }
//        System.out.println("Girdiginiz sayilarin EBOB\'u : " + ebob);

//        for (int i = 1; i <= (sayi1 * sayi2); i++) {
//            //System.out.println("ekok basamak " + i);
//            if (i % sayi1 == 0 && i % sayi2 == 0) {
//                ekok = i;
//                break;
//            }
//
//        }
//        System.out.println("Girdiginiz sayilarin EKOK\'u : " + ekok);

        while (sayac <sayi1*sayi2){
            if (sayac % sayi1== 0 && sayac % sayi2 == 0) {
                ekok = sayac;
            }
            sayac++;
        }
        System.out.println("Girdiginiz sayilarin EKOK\'u : " + ekok);




    }
}
