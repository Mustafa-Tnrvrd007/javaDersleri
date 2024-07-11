package D6_javaArrays;
//Dizideki Tekrar Eden Sayıları Bulan Program

// Odev
/*
Bir sayı dizisindeki tekrar eden çift sayıları
belirten bir program yaz.
 */
import java.util.Arrays;

public class P4_TekrarEdenSayilariBulma {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 4, 7, 8, 9, 10, 2, 3, 9, 8, 7, 72, 10};
        int[] duplicate = new int[list.length];
        int index = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {

                if (i != j && list[i] == list[j]) {
                    if (!isFind(list[i], duplicate) && list[i] % 2 == 0){
                        duplicate[index] = list[i];
                        index++;
                    }

                }
            }
        }
        for (int i : duplicate) {
            if (i != 0) {
                System.out.print(i + "\t");
            }

        }
        //System.out.println(Arrays.toString(duplicate));
    }

    static boolean isFind(int number, int[] list) {
        boolean kontrol = false;
        for (int sayi : list) {
            if (sayi == number) {
                kontrol = true;
                break;
            }
        }
        return kontrol;
    }
}
