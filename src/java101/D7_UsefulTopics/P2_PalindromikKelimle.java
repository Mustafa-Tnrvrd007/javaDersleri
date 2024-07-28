package java101.D7_UsefulTopics;
/*
Java dilinde kullanıcının girdiği kelimenin "Palindromik"
olup olmadığı bulan bir program yazıyoruz.

Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi
veriyorsa o kelime "Palindromik Kelime'dir".

Örnek : abba , asa , kavak, kayak

 */
/*
1- kullanıcıdan kelime alınır
2- palindromik olup olmadığı kontrol edilir
3- geri dönüüt verilir
 */

import java.util.Scanner;

public class P2_PalindromikKelimle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kelime, kelimeninTersi;
        System.out.println("Kontrol etmek istediginiz kelimeyi girin : ");
        kelime = input.nextLine();
        if (palindromik(kelime)) {
            System.out.println("Girdiginiz kelime Palindromik");
        } else {
            System.out.println("Girdiginiz kelime Palindromik degildir !");

        }


    }

    static boolean palindromik(String str) {// kontrol yeri
        System.out.println(str + " kelimesi sorgulaniyor");

        if (str.equals(kelimeninTersi(str))) {
            return true;
        } else {
            return false;
        }


    }

    static String kelimeninTersi(String text) {

        String ters = "";
        for (int i = text.length() - 1; i >= 0; i--) {

            ters += text.charAt(i);
        }
        System.out.println("Kelimenin tersi : " + ters);

        return ters;
    }
}
