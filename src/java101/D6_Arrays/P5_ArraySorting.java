package java101.D6_Arrays;

import java.util.Scanner;

public class P5_ArraySorting {

    public static void main(String[] args) {
        int[] list = new int[7];
        elemanGirme(list);

        System.out.println("Duzensiz liste :");
        listeYazdir(list);

//        System.out.println("Siralanmis liste :");
//        listeSirala(list);
//        listeYazdir(list);
        listeSirala(list);


    }

    static void elemanGirme(int[] list) {
        Scanner input = new Scanner(System.in);
        System.out.println(list.length + " elemanlı dizinin elemanlarını giriniz : ");
        for (int i = 0; i < list.length; i++) {
            System.out.println("Eleman " + (i + 1) + " : ");
            list[i] = input.nextInt();
        }
    }

    static void listeYazdir(int[] list) {
        System.out.println();

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }

    static void listeSirala(int[] list) {
        int kucukSayi;
        // 7 6 5 4 3 2 1
        for (int i = 0; i < list.length; i++) {
            System.out.println("\nListe siralama " + i + ". adim :");
            for (int j = 0; j < list.length; j++) {
                System.out.println(list[i] + " ile " + list[j] + " karsilastiriliyor");

                if (list[i] < list[j]) {
                    kucukSayi = list[i];
                    list[i] = list[j];
                    list[j] = kucukSayi;
                    System.out.println(list[i] + " ile " + list[j] + "yer degistirdi\n");
                }
            }

            System.out.println(+i + ". adimda olusan liste :");
            listeYazdir(list);
            System.out.println("\n\n");

        }
    }

}
