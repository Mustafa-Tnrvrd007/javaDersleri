package java101.D2_KosulYapilari;

import java.util.Scanner;

public class P2_KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password, kayitliKullaniciAdi = "Mstf", kayitliSifre = "Tnr1234";
        System.out.println("Kullanici adinizi  giriniz ");
        userName = input.nextLine();
        System.out.println("Sifrenizi giriniz");
        password = input.nextLine();

        if (userName.equals(kayitliKullaniciAdi) && password.equals(kayitliSifre)) {
            System.out.println("Giris basarili");
        } else {
            System.out.println("Sifre veya kullanici adi yanlis\n\n");


        }

        System.out.println("Sifrenizi sifirlamak istermisiniz \n1-)Evet\t2-)Hayir");
        int secim = input.nextInt();
        input.nextLine();/// Scanner okuma hatası içic
        String yeniSifre;

        if (secim == 1) {

            System.out.println("Yeni sifre girin");

            yeniSifre = input.nextLine();

            if (yeniSifre.equals(kayitliSifre)) {
                System.out.println("Girdiginiz sifre eski sifre ile ayni olamaz ");

            } else {
                kayitliSifre = yeniSifre;
                System.out.println("Sifre basarıyla degistirilmistir");

            }

        } else if (secim == 2) {
            System.out.println("Cikis yaptiniz");
        } else {
            System.out.println("Hatali girdi");
        }


    }
}
