package D1_javaDegiskenler_practise;

import java.util.Scanner;

/*
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram
değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları
Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL

 */
public class P7_Manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armutKg = 2.14, elmaKg = 3.67, domatesKg = 1.11, muzKg = 0.95, patlicanKg = 5.00;
        double armut, elama, domates, muz, patlican, toplamFiyat;
        System.out.println("Kaç kg armut aldınız ? (Giriniz)");
        armut = input.nextDouble();
        System.out.println("Kaç kg elma aldınız ? (Giriniz)");
        elama = input.nextDouble();
        System.out.println("Kaç kg domates aldınız ? (Giriniz)");
        domates = input.nextDouble();
        System.out.println("Kaç kg muz aldınız ? (Giriniz)");
        muz = input.nextDouble();
        System.out.println("Kaç kg patlıcan aldınız ? (Giriniz)");
        patlican = input.nextDouble();

        toplamFiyat = armut * armutKg + elama * elmaKg + domates * domatesKg
                + muz * muzKg + patlican * patlicanKg;
        System.out.println("Toplaö fiyat " + toplamFiyat);


    }
}
