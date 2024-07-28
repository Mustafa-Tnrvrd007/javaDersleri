package java101.D6_Arrays;

import java.util.Scanner;

public class P2_DizideMaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = {56, 7, 1, 8, 666, -2, -33, 83, -10, 23, -40};
        printList(list);
        System.out.println("En kucuk deger : " + minList(list));
        System.out.println("En buyuk deger : " + maxList(list));

        /*
        Ödev
        Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve
        en büyük en yakın sayıyı bulan programı yazınız.

        Dizi : {15,12,788,1,-1,-778,2,0}
        Girilen Sayı : 5
        Girilen sayıdan küçük en yakın sayı : 2
        Girilen sayıdan büyük en yakın sayı : 12
         */

        System.out.println("Bir sayi girin : ");
        int number = input.nextInt();
        if (isHasNumber(number,list)){
            System.out.println("Girdiginiz sayi dizide mevcut");
        }else {
            System.out.println("Girdiginiz sayi dizide bulunmamaktadir");
        }

        printList(list);

        System.out.println("\nGirdiginiz sayiya en yakin degerler :");
        System.out.println("En yakn kucuk sayi : "+nearestSmallestNumber(number,list));
        System.out.println("En yakn buyuk sayi : "+nearestLargestNumber(number,list));
        System.out.println("\n\n");


    }
    static  int nearestSmallestNumber (int number , int[] list){
        int nearSmall = number;
        boolean loopCondition = true;
        while (loopCondition){
            nearSmall--;

            for (int i = 0; i < list.length; i++) {
                if (nearSmall == list[i]){
                    loopCondition = false;
                    break;
                }
            }
        }
        return nearSmall;

    }
    static  int nearestLargestNumber (int number , int[] list){
        int nearLarge = number;
        boolean loopCondition = true;
        while (loopCondition){
            nearLarge++;

            for (int i = 0; i < list.length; i++) {
                if (nearLarge == list[i]){
                    loopCondition = false;
                    break;
                }
            }
        }
        return nearLarge;

    }

    static boolean isHasNumber(int number , int[] list) {
        boolean isHas = false;
        for (int i = 0; i < list.length; i++) {
            if (number == list[i]){
                isHas = true;
                break;
            }
        }
        return isHas;
    }

    static int minList(int[] dizi) {
        int min = 999999;// olabildigince yuksek deger verdik .
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] < min) {
                min = dizi[i];
            }
        }

        return min;
    }

    static int maxList(int[] dizi) {
        int max = -999999;// olabildigince dusuk deger verdik .
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > max) {
                max = dizi[i];
            }
        }

        return max;
    }

    static void printList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " , ");
        }
        System.out.println();
    }
}
