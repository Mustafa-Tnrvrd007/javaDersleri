package java101.D3_Donguler;
/*
Java ile kullanıcının girdiği değerler ile üslü sayı
hesaplayan programı yazıyoruz.

Ödev
Java ile kullanıcının girdiği değerler ile üslü sayı
hesaplayan programı "For Döngüsü" kullanarak yapınız.
 */

import java.util.Scanner;

public class P5_UssHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Taban sayisini girin :");
        int taban = input.nextInt();
        System.out.println("Uss sayisini girin : ");
        int uss = input.nextInt(), sayac = 1, sonuc = taban;

        // uss bulma while ile
//        while (sayac < uss) {
//            sonuc = sonuc * taban;
//            sayac++;
//        }
//        System.out.println("Sonuc : " + sonuc);

        // for ile uss hesaplama
        for (int i=1;i<uss;i++){
            sonuc = sonuc * taban;
        }
        System.out.println("sonuc = "+sonuc);


    }
}
