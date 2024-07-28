package java101.D4_Metotlar;
/*
Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala
uyan döngü kullanmadan bir "Recursive" metot yazın.

Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen
sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana
son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

Senaryolar
N Sayısı : 16
Çıktısı : 16 11 6 1 -4 1 6 11 16

N Sayısı : 10
Çıktısı : 10 5 0 5 10

*/

import java.util.Scanner;

public class P6_DeseneGoreMetot {
    static int desenAzaltma(int number,int temp) {

        if (number == 0 || number < 0){

            desenArttirma(number,temp);
            return number;

        }
        else {
            System.out.print(number+" ");

            return desenAzaltma((number-5),temp);
        }
    }
    static int desenArttirma(int number,int temp){
        System.out.print(number+" ");
        if (number==temp){
            return number;
        }else {
            return desenArttirma((number+5),temp);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi girin : ");
        int sayi = input.nextInt(),temp;
        temp=sayi;
        desenAzaltma(sayi,temp);


    }
}
