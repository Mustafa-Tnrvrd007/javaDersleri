package java101.D3_Donguler;

import java.util.Scanner;

public class P11_AtmProjesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int sayac = 1, secim, hesaptakiPara = 5000, para;
        do { // kullanici girisi sorgulama
            System.out.println("Kullanici adinizi giriniz :");
            userName = input.nextLine();
            System.out.println("Sifrenizi giriniz :");
            password = input.nextLine();

            if (userName.equals("mstf") && password.equals("123456")) {
                System.out.println("Giris Basarili ");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");

                    secim = input.nextInt();
                    switch (secim) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            para = input.nextInt();
                            hesaptakiPara += para;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            para = input.nextInt();
                            if (para > hesaptakiPara) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                hesaptakiPara -= para;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + hesaptakiPara);
                            break;

                    }



                } while (secim != 4);
                System.out.println("Tekrar görüşmek üzere.");

                break;

            } else {
                System.out.println("Hatalı kullanıcı adı veya şifre.");
                System.out.println(sayac + ". deneme basarisiz \n" + (3 - sayac) + " hakkin kaldi");
            }

            sayac++;
        } while (sayac <= 3);

        if (sayac > 3) {
            System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
        }


    }
}
