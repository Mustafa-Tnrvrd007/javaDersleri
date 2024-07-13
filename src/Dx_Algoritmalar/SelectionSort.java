package Dx_Algoritmalar;

/*
[22,27,16,2,18,6] -> Insertion Sort

Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.

Big-O gösterimini yazınız.

Time Complexity: Dizi sıralandıktan sonra 18 sayısı
aşağıdaki case'lerden hangisinin kapsamına girer? Yazınız

Average case: Aradığımız sayının ortada olması
Worst case: Aradığımız sayının sonda olması
Best case: Aradığımız sayının dizinin en başında olması.

[7,3,5,8,2,9,4,15,6] dizisinin Selection Sort'a göre ilk 4 adımını yazınız.
 */

public class SelectionSort {
    public static void main(String[] args) {

        int[] list = {22, 27, 16, 2, 18, 6}; // dizi olusturuldu
        list = selectSort(list);
        printList(list);
        /*
        Time Complexity: Dizi sıralandıktan sonra 18 sayısı
aşağıdaki case'lerden hangisinin kapsamına girer? Yazınız
         */
        System.out.println("18 sayisi dizinin ortalarında oldugu icin Average case'dir");

//        int[] worstCase = {5,4,3,2,1,0}; // worst case
//        System.out.println("\n\n");
//        worstCase = selectSort(worstCase);
//        printList(worstCase);

        System.out.println("\nToplam islem sayisi formulu :\nn*(n+1)/2 yani (n^2+n)/2");
        System.out.println("Burdan Big(O) = n^2 olur");

    }

    static void printList(int[] list) {
        System.out.print("Dizi :\t");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    static int[] selectSort(int[] dizi) { // sıralama fonksiyonu
        System.out.println("Dizinin mevcut hali :");
        printList(dizi);
        int kucukSayi,islemSayisi,bigOnotation=0;
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(i+1 + ". adim : eldeki sayi : " + dizi[i]);
            kucukSayi = dizi[i];
            islemSayisi=0;
            for (int j = i + 1; j < dizi.length; j++) {
                System.out.println("\t" + dizi[i] + " ile " + dizi[j] + " karsilastiriliyor");

                if (dizi[j] < kucukSayi) {
                    System.out.println("\t\t" + dizi[j] + " < " + dizi[i] + " oldugu icin yer degistiriliyor."+
                            " Eldeki sayi " + dizi[j]+" oluyor");

                    /// {3,2,5,1,10} i =0 ; dizi[i]= 3 ; dizi[j] = 2; kucukSayi = 3;
                    dizi[i] = dizi[j];
                    dizi[j] = kucukSayi;
                    kucukSayi = dizi[i];
                    System.out.println("Olusan dizi :");
                    printList(dizi);
                    islemSayisi++;

                }

            }

            System.out.println("\n"+(i+1)+".adimda gerceklesen islem sayisi = "+islemSayisi+"\n");
            bigOnotation += islemSayisi;
        }
        System.out.println("Toplam islem sayisi  = "+ bigOnotation+"\n\n");
        return dizi;
    }
}
