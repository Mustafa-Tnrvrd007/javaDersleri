package java101.D4_Metotlar;
/*
Gelişmiş Hesap Makinesi
Java ile kullanıcın seçtiği işlemleri yapan hesap makinesi yapıyoruz.

Hesap makinesinin fonksiyonları :

1- Toplama İşlemi
2- Çıkarma İşlemi
3- Çarpma İşlemi
4- Bölme işlemi
5- Üslü Sayı Hesaplama
6- Faktoriyel Hesaplama
7- Mod Alma
8- Dikdörtgen Alan ve Çevre Hesabı

 */

import java.util.Scanner;

public class P3_HesapMakinesi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        boolean dongu = true;
        while (dongu) {
            System.out.println("MENU\n" +
                    "0- Cikis" +
                    "1- Toplama İşlemi\n" +
                    "2- Çıkarma İşlemi\n" +
                    "3- Çarpma İşlemi\n" +
                    "4- Bölme işlemi\n" +
                    "5- Üslü Sayı Hesaplama\n" +
                    "6- Faktoriyel Hesaplama\n" +
                    "7- Mod Alma\n" +
                    "8- Dikdörtgen Alan ve Çevre Hesabı\n\n" +
                    "Yapacaginiz islemi secin : ");
            select = input.nextInt();
            switch (select) {
                case 0:
                    dongu = false;
                    break;
                case 1:
                    System.out.println("Sonuc : " + toplama());

                    break;
                case 2:
                    System.out.println("Sonuc : " + cikarma());

                    break;
                case 3:
                    System.out.println("Sonuc : " + carpma());

                    break;
                case 4:
                    System.out.println("Sonuc : " + bolme());

                    break;
                case 5:
                    System.out.println("Sonuc : " + ussAlma());

                    break;
                case 6:
                    System.out.println("Sonuc : " + faktoriel());

                    break;
                case 7:
                    System.out.println("Sonuc : " + mod());

                    break;
                case 8:
                    dikdortgen();

                    break;


            }
        }


    }

    static int kullanicidanVeriAlma() {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("Sayiyi girin : ");
        a = input.nextInt();
        return a;
    }

    static int toplama() {
        int n1 = kullanicidanVeriAlma(), n2 = kullanicidanVeriAlma();

        return n1 + n2;
    }

    static int cikarma() {
        int n1 = kullanicidanVeriAlma(), n2 = kullanicidanVeriAlma();


        return n1 - n2;
    }

    static int carpma() {
        int n1 = kullanicidanVeriAlma(), n2 = kullanicidanVeriAlma();

        return n1 * n2;
    }

    static int bolme() {
        int n1 = kullanicidanVeriAlma(), n2 = kullanicidanVeriAlma();
        if (n2 == 0) {
            System.out.println("Bir sayi sifira bolunemez !");
            return -1;
        }
        return n1 / n2;
    }

    static int ussAlma() {
        int n1 = kullanicidanVeriAlma(), n2 = kullanicidanVeriAlma(), sonuc = 1;


        for (int i = 0; i < n2; i++) {
            sonuc *= n1;
        }
        return sonuc;
    }

    static int faktoriel() {
        int n1 = kullanicidanVeriAlma(), sonuc = 1;

        for (int i = 1; i <= n1; i++) {
            sonuc *= i;
        }
        return sonuc;
    }

    static int mod() {
        int n1 = kullanicidanVeriAlma(), n2 = kullanicidanVeriAlma();

        return n1 % n2;
    }

    static void dikdortgen() {
        int n1 = kullanicidanVeriAlma(), n2 = kullanicidanVeriAlma();

        System.out.println("Dikdortgenin alani = " + (n1 * n2));
        System.out.println("Dikdortgenin cevresi = " + ((n1 + n2) * 2));
    }


}
