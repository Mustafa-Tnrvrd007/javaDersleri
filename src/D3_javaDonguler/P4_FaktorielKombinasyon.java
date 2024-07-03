package D3_javaDonguler;
/*
Java ile faktöriyel hesaplayan program yazıyoruz.
 */
import java.util.Scanner;

public class P4_FaktorielKombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        // Faktoriel
        System.out.println("Bir sayi girin : ");
        int sayi = input.nextInt(),faktoriel=1;

        for (int i = 1; i <= sayi; i++) {
            System.out.println(i+" * "+faktoriel+" = "+ (i*faktoriel));
            faktoriel*=i;
        }

        System.out.println(sayi+"! = "+faktoriel);

         */
        /*
        Ödev
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı
farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
         */
        System.out.println("Bir sayi girin :");
        int n = input.nextInt(),nFaktoriel=1;
        System.out.println("Bir sayi daha girin :");
        int r = input.nextInt(),rFaktoriel=1,farkinFaktorieli=1;

        for (int i = 1; i <= n; i++) { // n faktoriel hesaplama
            nFaktoriel *=i;
        }
        System.out.println("n Faktoriel = "+nFaktoriel);


        for (int i = 1; i <= r; i++) { // r faktoriel hesaplama
            rFaktoriel *=i;
        }
        System.out.println("r Faktoriel = "+rFaktoriel);


        for (int i = 1; i <= (n-r); i++) { // r faktoriel hesaplama
            farkinFaktorieli *=i;
        }
        System.out.println("r Faktoriel = "+rFaktoriel);

        int sonuc = nFaktoriel /(rFaktoriel*farkinFaktorieli);

        System.out.println(n+"\'in "+r+"\'li kombinasyonu = "+sonuc);



    }
}
