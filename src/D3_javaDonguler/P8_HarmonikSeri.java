package D3_javaDonguler;
/*
Java ile girilen sayının harmonik serisini bulan program yazacağız.
 */

import java.util.Scanner;

public class P8_HarmonikSeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi ;
        System.out.println("Harmonik serisini ogrenmek istedigign sayiyi gir");
        sayi= input.nextInt();

        double harmonik=0;
        for (int i = 1; i <= sayi; i++) {
            harmonik += (1.0/i);
        }
        // (1/i) int / int = int olur
        // en az bi tanesini double yaparsak sonuc double olur
        System.out.println("Girdigin sayinin harmonik serisi = "+harmonik);

    }
}
