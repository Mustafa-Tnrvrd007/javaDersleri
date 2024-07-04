package D3_javaDonguler;
/*
Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

Örnek : 1643 = 1 + 6 + 4 + 3 = 14
 */

import java.util.Scanner;

public class P7_BasamaklarToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, basamakSayisi = 0, deger, enBuyukBasamakDegeri = 1, oAnkiBasamak, toplam = 0;
        System.out.println("Bir sayi girin :");
        sayi = input.nextInt();

        // sayi kaç basamakli
        deger = sayi;
        while (deger > 0) {
            basamakSayisi++;
            deger /= 10;
        }
        System.out.print("Basamak sayisi = " + basamakSayisi);

        // en buyuk basamak degeri = 10^basamak sayisi
        for (int i = 1; i < basamakSayisi; i++) {
            enBuyukBasamakDegeri *= 10;
        }
        System.out.println("\tEn buyuk basamak degeri = " + enBuyukBasamakDegeri);

        deger = sayi;
        while (deger > 0) { // her basamaktaki sayiyi toplamak için

            oAnkiBasamak = deger / enBuyukBasamakDegeri;// basamaktaki sayiyi bulduk
            toplam += oAnkiBasamak;

            deger %= enBuyukBasamakDegeri;// bir basamak dusurduk
            enBuyukBasamakDegeri /= 10;// bir basamak dusurduk
        }
        System.out.println("Girdiginiz sayinin basamaklarinin toplami = " + toplam);
        System.out.println("\n\n");

    }
}
