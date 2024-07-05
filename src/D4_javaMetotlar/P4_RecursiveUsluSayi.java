package D4_javaMetotlar;
/*
Recursive Metotlar ile Üslü Sayı Hesaplama
Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini
"Recursive" metot kullanarak yapan programı yazınız.

Senaryo

Taban değeri giriniz :2 Üs değerini giriniz : 0
Sonuç : 1
Taban değeri giriniz : 2
Üs değerini giriniz : 3
Sonuç : 8
Taban değeri giriniz : 5
Üs değerini giriniz : 3
Sonuç : 125
 */

import java.util.Scanner;

public class P4_RecursiveUsluSayi {
    static int ussAlma(int base, int power) {

        // recursive adımları anlamak icin
        System.out.print("taban = " + base + " uss = " + power);
        System.out.println("\t==>\t\t"+base+"^"+power+" = "+Math.pow(base,power));

        if (power == 0) {
            return 1;
        } else {
            return base * ussAlma(base, --power);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int taban, uss;
        System.out.println("Taban degerini girin :");
        taban = input.nextInt();
        System.out.println("Uss degerini girin ");
        uss = input.nextInt();

        System.out.println(taban + "^" + uss + " = " + ussAlma(taban, uss));
        /*ussAlma(2, 3)
        taban = 2 uss = 3   ==>      2^3 = 2 * 2^2  = 8
        taban = 2 uss = 2   ==>      2^2 = 2 * 2^1  = 4
        taban = 2 uss = 1   ==>      2^1 = 2 * 2^0  = 2
        taban = 2 uss = 0   ==>      2^0 = 1
        2^3 = 8
         */

    }
}
