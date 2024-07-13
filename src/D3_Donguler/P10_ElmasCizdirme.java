package D3_Donguler;
/*
elmas cizdirme
 */

import java.util.Scanner;

public class P10_ElmasCizdirme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cizdireceginiz elmasin buyuklugunu girin : ");
        int basamak = input.nextInt(), sayi,yildizSayisi=1,boslukSayisi;

        boslukSayisi = basamak-1;
        for (int i = 0; i < basamak ; i++) {// dis dongu , elmasın ust kısmı
            for (int j = 0; j < boslukSayisi; j++) {// bosluk sayisi
                if (i<=(basamak/2)){
                    continue;
                }
                System.out.print(" ");
            }
            for (int j = 0; j < yildizSayisi; j++) {
                if (i<=(basamak/2)){
                    continue;
                }
                System.out.print("*");
            }
            boslukSayisi--;
            yildizSayisi+=2;
            System.out.println();
        }

        for (int i = 0; i <basamak; i++) { // ters ucgen
            yildizSayisi-=2;
            boslukSayisi++;
            for (int j = 0; j < boslukSayisi; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j < yildizSayisi; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }
}
