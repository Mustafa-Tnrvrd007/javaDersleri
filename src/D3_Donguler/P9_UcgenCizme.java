package D3_Donguler;
/*
  (*) karakterleri kullanarak ucgen cizme
 */

import java.util.Scanner;

public class P9_UcgenCizme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ucgen kac basamakli olsun ?");
        int basamak = input.nextInt(),yildizSayisi=1,boslukSayisi;

        boslukSayisi = basamak-1;
        for (int i = 0; i < basamak; i++) { // dış dongü Ucgenin basamaklarını belirler
            for (int j = 0; j < boslukSayisi; j++) { // bosluk sayisini belirler
                System.out.print(" ");
            }
            for (int j = 0; j < yildizSayisi; j++) {// yildiz sayisi ile tek sayilarda ilerleme yapilacak
                System.out.print("*");
            }
            yildizSayisi += 2; // yukardan asagiya dogru * sayisi 2'şer artar
            boslukSayisi--; // yukardan asagiya dogru bosluk azalir

            System.out.println();

        }

    }
}
