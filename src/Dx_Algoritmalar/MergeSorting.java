package Dx_Algoritmalar;


public class MergeSorting {

    public static void main(String[] args) {
        int[] arr = {16,21,11,8,12,22};
        System.out.println("Verilen dizi: ");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSıralanmış dizi: ");
        printArray(arr);

    }

    // Böl ve fethet (Divide and Conquer) yaklaşımı
    public static void mergeSort(int[] arr, int left, int right) {
        // diziyi bolmek için ozyinelemeli metodlar kullanılıyor
        // sağ taraf ve sol taraf için 2 farklı metod
        if (left < right) {
            int mid = left + (right - left) / 2;

            // İlk yarıyı sıralama // sol taraf
            mergeSort(arr, left, mid);
            // İkinci yarıyı sıralama // sag taraf
            mergeSort(arr, mid + 1, right);

            // İki yarıyı birleştirme
            merge(arr, left, mid, right);
        }
    }

    // Birleştirme (Merge) işlemi
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Geçici diziler oluşturma
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Geçici dizilere veri kopyalama
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[mid + 1 + j];
        }

        // Geçici dizilerden ana diziye veriyi birleştirme
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Kalan elemanları kopyalama
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }



    // Diziyi yazdırma fonksiyonu
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
