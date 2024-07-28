package java101.D3_Donguler;

import java.util.Scanner;

/*
Java döngüler ile fibonacci serisi bulan program yazıyoruz.
Fibonacci serisinin eleman sayısını kullanıcıdan alın.
Fibonacci dizisi, 0'dan başlar ve sonsuza kadar.
Her rakam, bir önceki rakamla toplanır.
Elde edilen sonuç rakamın sağ tarafına yazılır.
Fibonacci dizisinin ilk on sayısı şu şekildedir:

9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
 */
public class P17_Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int basamakSayisi ,sayac=0,sayi1=0,sayi2=1,yeniSayi;
        System.out.println("Fibonacci serisinden kac eleman gormek istersiniz : ");
        basamakSayisi =input.nextInt();
        System.out.print(sayi1+" "+sayi2+" ");
        do {
            yeniSayi=sayi1+sayi2;
            System.out.print(yeniSayi+" ");
            sayi1=sayi2;
            sayi2=yeniSayi;
            sayac++;
        }while (sayac<(basamakSayisi-2));

    }
}
