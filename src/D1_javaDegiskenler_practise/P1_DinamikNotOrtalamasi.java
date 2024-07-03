package D1_javaDegiskenler_practise;

import java.util.Scanner;

/*
 * Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik
 * derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını
 * hesaplayıp ekrana bastırılan programı yazın.
 *  */
public class P1_DinamikNotOrtalamasi {
    public static void main(String[] args) {
        int mat, fiz, kim, tur, tar, muz, toplam;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Matematik notunu giriniz : ");
        mat = input.nextInt();

        System.out.println("Lütfen Fizik notunu giriniz : ");
        fiz = input.nextInt();
        System.out.println("Lütfen Kimya notunu giriniz : ");
        kim = input.nextInt();
        System.out.println("Lütfen Turkçe notunu giriniz : ");
        tur = input.nextInt();
        System.out.println("Lütfen Tarih notunu giriniz : ");
        tar = input.nextInt();
        System.out.println("Lütfen Muzik notunu giriniz : ");
        muz = input.nextInt();

        toplam = mat + fiz + kim + tur + tar + muz;
        double sonuc = toplam / 6.0;

        System.out.println("Ortalamanız = " + sonuc);

        /*
         * Aynı program içerisinde koşullu ifadeler kullanılarak,
         *  eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" ,
         *  küçük ise "Sınıfta Kaldı" yazsın.
         * **/

        String mesaj;
        mesaj = (sonuc >= 60) ? "Sınıfı Geçti " : "Sınıfta kaldı";
        System.out.println(mesaj);


    }
}
