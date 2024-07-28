package java101.D4_Metotlar;
/*
Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının
"Asal" sayı olup olmadığını bulan programı yazın.

Senaryo
Sayı Giriniz : 22
22 sayısı ASAL değildir !


Sayı Giriniz : 2
2 sayısı ASALDIR !


Sayı Giriniz : 39
39 sayısı ASAL değildir !


Sayı Giriniz : 17
17 sayısı ASALDIR !

 */

import java.util.Scanner;

public class P5_RecursiveAsal {
    static boolean isPrimeNumber(int number, int temp) {
        boolean kontrol = true;
        System.out.println(" Sayi = "+number+ "asal durumu "+kontrol);
        if (number == 1) {
            return kontrol = true;

        } else if (temp % number != 0) {

            isPrimeNumber(--number, temp);
            return true;
        } else {
            return kontrol = false;

        }


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi girin : ");
        int sayi = input.nextInt(), temp;
        temp = sayi;

        if (isPrimeNumber(--sayi, temp)){
            System.out.println("Girdiginiz sayi asaldir");
        }else {
            System.out.println("Girdiginiz sayi asal degildir");
        }


    }
}
