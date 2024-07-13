package D2_KosulYapilari;
/*
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın
ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

* Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
    yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya
    "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
##############################################################################

* Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
* Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
* Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
* Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

*/

import java.util.Scanner;

public class P7_UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafe, yas, yolculukTpi;

        double toplamTutar, birimYolFiyat = 0.10, indirimOrani = 0;

        System.out.println("Gideceginiz mesafeyi km cinsinden yaziniz");
        mesafe = input.nextInt();
        System.out.println("Yasinizi giriniz");
        yas = input.nextInt();
        System.out.println("Yolculuk tipini giriniz\n1) Tek gidis \t2)Gidis Donus ");
        yolculukTpi = input.nextInt();

        //System.out.println("Mesafe :" + mesafe + " Yas : " + yas + " Gidis tipi : " + yolculukTpi);

        if (mesafe > 0 && yas > 0 && (yolculukTpi == 1 || yolculukTpi == 2)) {
            //System.out.println("Girdiler dogru");
            toplamTutar = mesafe * birimYolFiyat; // yol ücreti
            //System.out.println("Indirimsiz yol ucreti : " + toplamTutar);

            if (yas < 12) indirimOrani = 0.5;
            else if (yas < 25) indirimOrani = 0.1;
            else if (yas > 65) indirimOrani = 0.3;

            if (indirimOrani>0.0){
                System.out.print("Yas indirimi \nIndirimsiz Ucret : " + toplamTutar +
                        "\tYas indirim orani : %" + (indirimOrani * 100) +
                        "\tIndirim tutari : " + (indirimOrani * toplamTutar));
                toplamTutar -= (indirimOrani * toplamTutar);
                System.out.println("\tIndirimli ucret = " + toplamTutar);
            }else {
                System.out.println("Yas indirimi yok indirimsiz Ucret : " + toplamTutar );
            }


            if (yolculukTpi == 2){
                indirimOrani = 0.2;
                System.out.print("Yolculuk tipi indirimi \nIndirimsiz Ucret : " + toplamTutar +
                        "\tYas indirim orani : %" + (indirimOrani * 100) +
                        "\tIndirim tutari : " + (indirimOrani * toplamTutar));
                toplamTutar -= (indirimOrani * toplamTutar);
                System.out.println("\tIndirimli ucret = " + toplamTutar+
                        "\nGidis + donus toplam tutar = "+(toplamTutar*2));

            }else {
                System.out.println("Yolculuk tipi indirimi yok indirimsiz Ucret : " + toplamTutar );

            }


        } else {
            System.out.println("Hatali girdi");
        }


    }
}
