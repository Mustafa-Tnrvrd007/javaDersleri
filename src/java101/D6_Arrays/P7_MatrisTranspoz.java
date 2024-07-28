package java101.D6_Arrays;
/*
Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin
transpozunu bulan programı yazınız.

Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı
satırları ile sütunlarının yer değiştirmesi demektir.
Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur (devriğidir).
Bu aşamada kxn’lik bir matrisin transpozu (devriği)
nxk’lik bir matris olur.
Örneğin bir A matrisimiz olsun. Bu A
matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir.

Senaryo
Matris :
2    3    4
5    6    4
Transpoze :
2    5
3    6
4    4

 */

import java.util.Scanner;

public class P7_MatrisTranspoz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int satir, kolon;
        System.out.println("Matrisin kaç satiri olsun : ");
        satir = input.nextInt();
        System.out.println("Matrisin kaç stun olsun : ");
        kolon = input.nextInt();

        int[][] matris = new int[satir][kolon] , tersmatris;
        elemanGirme(matris);
        System.out.println("Girdisiniz matris : ");
        printMatris(matris);

        tersmatris = transpoz(matris,satir,kolon);
        System.out.println("Transpoz matris : ");
        printMatris(tersmatris);




    }

    static int[][] transpoz(int[][] matris, int satir, int stun) {
        int[][] transpozMatris = new int[stun][satir];

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                transpozMatris[j][i] = matris[i][j];
            }
        }
        return transpozMatris;
    }

    static void elemanGirme(int[][] matris){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.println(i+". satir "+j+" stun elemanini girin :");
                matris[i][j] = input.nextInt();
            }
        }
    }
    static  void printMatris(int[][] matris){
        System.out.println();

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j]+"\t");

            }
            System.out.println();
        }
    }
}
