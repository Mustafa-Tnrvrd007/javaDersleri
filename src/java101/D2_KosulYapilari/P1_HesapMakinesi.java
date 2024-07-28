package java101.D2_KosulYapilari;

import java.util.Scanner;

public class P1_HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, islem;
        System.out.println("Birinci sayiyi girin : ");
        n1 = input.nextInt();
        System.out.println("Ikinci sayiyi girin : ");
        n2 = input.nextInt();

        //System.out.println("Girdiginiz ilk sayi = "+n1+" ikinci sayi = "+n2);

        System.out.println("Yapacaginiz islemi secin \n1-) Toplama\t2-)Cikarma\t3-)Carpma\t4-)Bolme");
        islem = input.nextInt();

        switch (islem) {
            case 1:
                System.out.println("Toplama islemi sonucu  : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Cikarma islemi sonucu : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Carpma islemi sonucu  : " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Carpma islemi sonucu  : " + (n1 / n2));
                    break;
                } else {
                    System.out.println("Bir sayi 0'a bölünemez" );
                    break;
                }

            default:
                System.out.println("Hatali giris yaptiniz");

        }


    }
}
