package java101.D3_Donguler;
/*
Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak,
yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

Örnek
Basamak Sayısı : 10

*******************
*****************
***************
*************
***********
*********
*******
*****
***
*

 */

import java.util.Scanner;

public class P15_TersUcgen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ucgen kac Basamakli olsun : ");
        int basamakSayisi, boslukSayisi = 0, yildizSayisi = 1;
        basamakSayisi = input.nextInt();

        // yildiz sayisini hesaplayalim
        for (int i = 0; i < (basamakSayisi - 1); i++) {
            yildizSayisi += 2;
        }

        for (int i = 0; i < basamakSayisi; i++) { // dis dongu
            for (int j = 0; j < boslukSayisi; j++) {
                System.out.print(" ");
            }
            boslukSayisi++;
            for (int j = 0; j < yildizSayisi; j++) {
                System.out.print("*");
            }
            yildizSayisi -= 2;
            System.out.println();

        }

    }
}
