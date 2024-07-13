package D4_Metotlar;
/*
Java ile bir sayının "Palindrom Sayı" olup
olmadığını bulan bir program yapıyoruz.

Palindrom Sayı Nedir ?
Palindromik sayı, iki taraftan okunduğu zaman
okunuş yönüyle aynı olan sayılardır.

Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
 */

import java.util.Scanner;

public class P1_PalindromSayilar {

    static boolean palindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp > 0) {

            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;

        }
        if (reverseNumber == number) {
            return true;
        } else {
            return false;

        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi girin : ");
        int sayi = input.nextInt();

        if (palindrom(sayi)) {
            System.out.println("Girdiginiz sayi polindrom sayi");

        }else {
            System.out.println("Girdiginiz sayi palindrom degildir ! ");
        }

    }
}
