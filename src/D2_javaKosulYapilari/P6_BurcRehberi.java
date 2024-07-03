package D2_javaKosulYapilari;

import java.util.Scanner;
/*
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık


 */

public class P6_BurcRehberi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mounth, day;
        System.out.println("Dogdugunuz ayı girin");
        mounth = input.nextInt();
        System.out.println("Dogdugunuz gunu girin");
        day = input.nextInt();

        String burc = "";
        boolean isFalse = false;

        if (mounth == 1) {
            if (day <= 21 && day >= 1) burc = "Oglak";
            else if (day > 21 && day <= 31) burc = "Kova";
            else isFalse = true;

        } else if (mounth == 2) {
            if (day <= 19 && day >= 1) burc = "Kova";
            else if (day > 21 && day <= 28) burc = "Balik";
            else isFalse = true;

        } else if (mounth == 3) {
            if (day <= 20 && day >= 1) burc = "Balik";
            else if (day > 21 && day <= 31) burc = "Koc";
            else isFalse = true;

        } else if (mounth == 4) {
            if (day <= 20 && day >= 1) burc = "Koc";
            else if (day > 21 && day <= 30) burc = "Boga";
            else isFalse = true;

        } else if (mounth == 5) {
            if (day <= 21 && day >= 1) burc = "Boga";
            else if (day > 21 && day <= 31) burc = "Ikizler";
            else isFalse = true;

        } else if (mounth == 6) {
            if (day <= 22 && day >= 1) burc = "Ikizler";
            else if (day > 21 && day <= 30) burc = "Yengec";
            else isFalse = true;

        } else if (mounth == 7) {
            if (day <= 23 && day >= 1) burc = "Yengec";
            else if (day > 21 && day <= 31) burc = "Aslan";
            else isFalse = true;
        } else if (mounth == 8) {
            if (day <= 23 && day >= 1) burc = "Aslan";
            else if (day > 21 && day <= 31) burc = "Basak";
            else isFalse = true;
        } else if (mounth == 9) {
            if (day <= 23 && day >= 1) burc = "Basak";
            else if (day > 21 && day <= 30) burc = "Terazi";
            else isFalse = true;
        } else if (mounth == 10) {
            if (day <= 23 && day >= 1) burc = "Terazi";
            else if (day > 21 && day <= 31) burc = "Akrep";
            else isFalse = true;
        } else if (mounth == 11) {
            if (day <= 23 && day >= 1) burc = "Akrep";
            else if (day > 21 && day <= 30) burc = "Yay";
            else isFalse = true;
        } else if (mounth == 12) {
            if (day <= 21 && day >= 1) burc = "Yay";
            else if (day > 21 && day <= 31) burc = "Oglak";
            else isFalse = true;
        } else isFalse = true;

        if (!isFalse) {
            System.out.println("Burcunuz = " + burc);
        } else {
            System.out.println("hatali gün veya ay gidiniz");
        }


    }
}
