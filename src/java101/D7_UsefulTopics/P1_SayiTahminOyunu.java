package java101.D7_UsefulTopics;
/*
Java dilinde programın 0-100 arasında rastgele seçtiği bir
 sayıyı kullanıcının tahmin etmesini istediğimiz bir
 "Sayı Tahmin Oyunu" yapıyoruz.
 */
/*
1- 1 ile 100 arası rastgele sayı olusturma
2- kullanıcıdan dongu içinde veri alma (5 hakkı var)
3- düşük veya yüksek diyerek kullanıcıyı yönlendirme
4- oyunun sonlandırılması
 */

import java.util.Scanner;

public class P1_SayiTahminOyunu {
    public static void main(String[] args) {
        // System.out.println(rastgeleSayi());

        if (game(rastgeleSayi())){
            System.out.println("Tebrikler dogru tahmin");
        }

    }

    static int rastgeleSayi() { // 1 ile 100 arasi rastgele sayi olusturuldu
        double rastgele = Math.random() * 100;

        return (int) Math.round(rastgele);
    }

    static boolean game(int number) { // oyun dongusu
        Scanner input = new Scanner(System.in);
        int rightGuess = 5, tahmin;

        System.out.println("Sayi tahmin oyununa hoşgeldiniz");
        System.out.println(rightGuess + " tahmin hakkınız var iyi oyunlar");

        for (int i = 0; i < rightGuess; i++) {
            System.out.println("Tahmin ettiginiz sayiyi girin : ");
            tahmin = input.nextInt();

            if (isFind(number,tahmin)) {
                return true;
            } else {
                System.out.println(rightGuess-i + " tahmin hakkınız kaldi");
            }


        }

        System.out.println("Game Over");
        System.out.println("Sayi : "+ number);


        return false;
    }

    static boolean isFind(int number, int tahmin) { // kullanıcıya geri bildirim verme

        if (number == tahmin) {
            return true;

        } else if (tahmin < number ) {
            System.out.println("Daha Yuksek");

        } else {
            System.out.println("Daha Dusuk");
        }
        return false;

    }
}
