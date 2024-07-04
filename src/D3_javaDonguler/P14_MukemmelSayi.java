package D3_javaDonguler;
/*
Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan
ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
değilse “mükemmel sayı değildir.” ifadelerini ekrana
yazan programı Java dilinde yazınız.

Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları
(kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.

Senaryolar
Bir sayı giriniz: 28
28 Mükemmel sayıdır
Bir sayı giriniz: 1
1 Mükemmel sayı değildir.
Bir sayı giriniz: 496
496 Mükemmel sayıdır
 */

import java.util.Scanner;

public class P14_MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, carpanSayiToplami = 0;
        System.out.println("Bir sayi girin : ");
        sayi = input.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                carpanSayiToplami += i;
            }
        }
        if (sayi == carpanSayiToplami) {
            System.out.println("Girdiginiz sayi Mukemmel sayidir.");
        } else {
            System.out.println("Girdiginiz sayi Mukkemmel sayi degildir !");
        }
    }
}
