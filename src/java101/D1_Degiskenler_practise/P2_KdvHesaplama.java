package java101.D1_Degiskenler_practise;

import java.util.Scanner;

public class P2_KdvHesaplama {
    public static void main(String[] args) {
        /*
         Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve
         KDV tutarını hesaplayıp ekrana bastıran programı yazın.

         (Not : KDV tutarını 18% olarak alın)
         */
        double tutar, kdvliTutar, kdv = 0.18;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen tutarı giriniz : ");
        tutar = input.nextDouble();
        /*
         Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
         tutar 1000 TL'den büyük ise KDV oranını %8 olarak
         KDV tutarı hesaplayan programı yazınız.
         */
        kdv = tutar < 1000 ? 0.18 : 0.08;
        kdvliTutar = tutar + (kdv * tutar);
        System.out.println("KDV = " + kdv + " Toplam tutar = " + kdvliTutar);


    }
}
