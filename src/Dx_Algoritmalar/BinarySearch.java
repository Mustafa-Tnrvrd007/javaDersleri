package Dx_Algoritmalar;


import java.util.Arrays;
/*
[7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamalarını yazınız.

Örnek: root x'dir. root'un sağından y bulunur. Solunda z bulunur vb.

 */

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {7, 5, 1, 8, 3, 6, 0, 9, 4, 2};
        int key = 1; // aranacak sayi

        // Diziyi sıralama
        Arrays.sort(array);

        int result = binarySearch(array, key);

        if (result == -1) {
            System.out.println("Eleman dizide bulunamadı.");
        } else {
            System.out.println("Eleman dizinin " + result + ". indeksinde bulundu.");
        }

    }

    // İkili arama algoritmasını uygulayan yöntem
    public static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        int middle;

        while (left <= right) {
            middle = left + (right - left) / 2;

            // Ortadaki elemanı kontrol etme
            if (array[middle] == key) {
                return middle;
            }

            // Aranan eleman ortadaki elemandan küçükse, sol tarafa bak
            if (array[middle] > key) {
                right = middle - 1;
            } else {
                // Aranan eleman ortadaki elemandan büyükse, sağ tarafa bak
                left = middle + 1;
            }
        }

        // Eleman bulunamadıysa -1 döndür
        return -1;
    }

}
