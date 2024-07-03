package D2_javaKosulYapilari;
/*
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55
 */

import java.util.Scanner;

public class P3_SinifGecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat,fiz,tur,kim,muz,ortalama,gecmeNotu=55;

        System.out.println("Matematik notunu giriniz");
        mat = input.nextInt();
        if (mat<0 || mat>100)  mat = 0;

        System.out.println("Fizik notunu giriniz");
        fiz = input.nextInt();
        if (fiz<0 || fiz>100)  fiz = 0;

        System.out.println("Kimya notunu giriniz");
        kim = input.nextInt();
        if (kim<0 || kim>100)  kim = 0;

        System.out.println("Turkce notunu giriniz");
        tur = input.nextInt();
        if (tur<0 || tur>100)  tur = 0;

        System.out.println("Muzik notunu giriniz");
        muz = input.nextInt();
        if (muz<0 || muz>100)  muz = 0;

        ortalama = (mat+fiz+tur+kim+muz) /5;
        if (ortalama<gecmeNotu){
            System.out.println("Kaldiniz . Donem tekrarı ");
        }else {
            System.out.println("Tebrikler , basariyla gectiniz");
        }
        System.out.println("Ortalama = "+ortalama);



    }
}
