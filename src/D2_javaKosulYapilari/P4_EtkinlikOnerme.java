package D2_javaKosulYapilari;
/*
Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
 */

import java.util.Scanner;

public class P4_EtkinlikOnerme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hava sicakligini giriniz");
        int sicaklik = input.nextInt();

        if (sicaklik<5) System.out.println("Kayak yapabilirsiniz");
        if (sicaklik>=5 && sicaklik<=15) System.out.println("Sinemaya gidebilirsiniz");
        if (sicaklik>=10 && sicaklik<=25) System.out.println("Piknik yapabilirsiniz");
        if (sicaklik>25) System.out.println("Yuzmeye gidebilirsiniz");



    }
}
