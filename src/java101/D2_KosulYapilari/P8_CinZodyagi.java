package java101.D2_KosulYapilari;

import java.util.Scanner;

/*
Çin Zodyağı nedir?
4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve
insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12
burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan
halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

Çin Zodyağı nasıl hesaplanır?
Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

Doğum Tarihi %12 = 0 ➜ Maymun
Doğum Tarihi %12 = 1 ➜ Horoz
Doğum Tarihi %12 = 2 ➜ Köpek
Doğum Tarihi %12 = 3 ➜ Domuz
Doğum Tarihi %12 = 4 ➜ Fare
Doğum Tarihi %12 = 5 ➜ Öküz
Doğum Tarihi %12 = 6 ➜ Kaplan
Doğum Tarihi %12 = 7 ➜ Tavşan
Doğum Tarihi %12 = 8 ➜ Ejderha
Doğum Tarihi %12 = 9 ➜ Yılan
Doğum Tarihi %12 = 10 ➜ At
Doğum Tarihi %12 = 11 ➜ Koyun
 */
public class P8_CinZodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil,zodyak;
        String burc="";
        System.out.println("Dogum yilinizi giriniz");
        yil = input.nextInt();

        zodyak=yil%12;
        System.out.println("zodyak yani mod  = "+zodyak);

        switch (zodyak){
            case 0:
                burc="Maymun";
                break;
            case 1:
                burc="Horoz";
                break;
            case 2:
                burc="Kopek";
                break;
            case 3:
                burc="Domuz";
                break;
            case 4:
                burc="Fare";
                break;
            case 5:
                burc="Okuz";
                break;
            case 6:
                burc="Kaplan";
                break;
            case 7:
                burc="Tavsan";
                break;
            case 8:
                burc="Ejderha";
                break;
            case 9:
                burc="Yilan";
                break;
            case 10:
                burc="At";
                break;
            case 11:
                burc="Koyun";
                break;
            default:
                System.out.println("Hatali girdi !");

        }

        System.out.println("Cin zodyagi burcunuz = "+burc);



    }
}
