package java101.D6_Arrays;

/*
Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani
frekanslarını bulan programı yazınız.

Senaryo
Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
Tekrar Sayıları
10 sayısı 3 kere tekrar edildi.
20 sayısı 4 kere tekrar edildi.
5 sayısı 1 kere tekrar edildi.
 */
public class P6_ArrayFrequency {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicate = new int[list.length];
        int[] duplicateQuantity = new int[list.length];
        int index = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {

                if (list[i] == list[j]) { // i != j &&
                    if (!isFind(list[i], list, i)) {

                        duplicate[index] = list[i];
                        duplicateQuantity[index]++;
                    }

                }
            }
            if (duplicate[index] != 0) {
                index++;
            }
        }
        for (int i = 0; i < duplicate.length; i++) {
            if (duplicate[i] != 0) {
                System.out.println(duplicate[i] + " sayisi " + duplicateQuantity[i] + " kere tekrar etti");
            }
        }



    }

    static boolean isFind(int number, int[] list, int index) {
        // indexe kadar listeyi kontrol edip aynı sayıdan bulmşmuyuz aona bakacak
        // eger varsa true yoksa false
        boolean kontrol = false;
        for (int i = 0; i < index; i++) {
            if (list[i] == number) {
                kontrol = true;
                break;
            }
        }
        return kontrol;
    }


}





