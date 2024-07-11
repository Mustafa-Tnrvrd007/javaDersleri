package D6_javaArrays;

public class P1_OrtalamaHesaplama {
    public static void main(String[] args) {
        // Dizideki Elemanların Ortalamasını Hesaplayan Program
        int[] list = { 2, 3, 4, 5};
        int sum = 0, average;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        average = sum / list.length;
        System.out.println("Listenin ortalamasi = " + average);
        /*
        Ödev
            Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

            Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi

         */
        //System.out.println("5 sayisinin harmonik degeri : " + harmonic(5));
        System.out.println("Listenin harmonik ortalamasi : "+harmonicAverage(list));
    }

    static double harmonic(int number) {
        // sayinin tersi alındı
        return (1.0 / number);
    }

    static double harmonicAverage(int[] list) {
        double average, sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += harmonic(list[i]);
        }
        average = list.length / sum;
        return average;
    }
}
