package D1_javaDegiskenler_practise;
/*
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;
 */

import java.util.Scanner;

public class P5_DaireninAlani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        double r,pi = 3.14,alan ,cevre;
        System.out.println("Dairenin yarıçapını girin");
        r= input.nextDouble();

        alan = r*r*pi;
        cevre = 2*pi*r;
        System.out.println("Dairenin alanı = " + alan+ "\nDairenin cevresi = "+cevre);
        */

        /*
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
            𝜋 sayısını = 3.14 alınız.
            Formül : (𝜋 * (r*r) * 𝛼) / 360
         */
        short aci ;
        double r,pi = 3.14,alan ;
        System.out.println("Daire diliminin yarıçapını girin");
        r= input.nextDouble();
        System.out.println("Daire diliminin acisini girin");
        aci = input.nextShort();

        alan = (pi*(r*r)*aci)/360;
        System.out.println("Daire diliminin alanı = "+alan);





    }
}
