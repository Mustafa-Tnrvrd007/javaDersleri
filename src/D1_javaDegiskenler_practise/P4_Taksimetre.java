package D1_javaDegiskenler_practise;

import java.util.Scanner;
/*
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.

 */

public class P4_Taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km,birimUcret=2.20,toplamTutar =10;
        System.out.println("Kaç km yol gittiğini giriniz : ");
        km = input.nextDouble();


        toplamTutar += km*birimUcret;
        toplamTutar = toplamTutar < 20 ? 20 : toplamTutar;
        System.out.println("Odenecek tutar = "+toplamTutar);



    }
}
