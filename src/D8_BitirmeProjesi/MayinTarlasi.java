package D8_BitirmeProjesi;

import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {
    int satir;
    int stun;
    char[][] tarla;
    int[][] mayin;


    MayinTarlasi(int satir, int stun) {
        this.satir = satir;
        this.stun = stun;
        this.tarla = new char[satir][stun];
        this.mayin = new int[(satir * stun) / 4][2];
        rastgeleMayinAtama(this.mayin);// mayinlari rast gele atadik

    }

    public void degerAta() {
        for (int i = 0; i < tarla.length; i++) {
            for (int j = 0; j < tarla[i].length; j++) {
                tarla[i][j] = '-';
            }

        }
    }

    public void tarlaYazdir() {
        System.out.println();
        for (int i = 0; i < this.satir; i++) {
            for (int j = 0; j < this.stun; j++) {
                System.out.print("\t" + this.tarla[i][j]);
            }
            System.out.println();
        }
    }

    public void rastgeleMayinAtama(int[][] matris) {
        // mayın matrisinin satir sayisi mayin sayisini belirler
        // random sayisi matrisin satir ve stun degerlerini geçmemeli

        Random random = new Random(); // bunun için Random kütüphanesi dahil ettim
/*
        for (int i = 0; i < mayin.length; i++) {
            matris[i][0] = random.nextInt(this.satir);
            matris[i][1] = random.nextInt(this.stun);
        }
*/
        int i = 0;
        while (i < matris.length) {
            if (!isFind(random.nextInt(this.satir), random.nextInt(this.stun))) {
                matris[i][0] = random.nextInt(this.satir);
                matris[i][1] = random.nextInt(this.stun);
                i++;
            }
        }


    }

    public void hileliTarlayiYazdir() {
        System.out.println("Hileli tarla");
        for (int i = 0; i < this.satir; i++) {
            for (int j = 0; j < this.stun; j++) {

                if (isFind(i, j)) {
                    System.out.print("\t" + "*");

                } else {
                    System.out.print("\t" + this.tarla[i][j]);

                }


            }
            System.out.println();
        }
    }

    public boolean isFind(int row, int column) { // girilen sayilar matris de var mi
        for (int i = 0; i < mayin.length; i++) {
            for (int j = 0; j < mayin[i].length; j++) {
                if (row == mayin[i][0] && column == mayin[i][1]) {
                    return true;
                }
            }

        }

        return false;
    }

    public boolean girilenKonum(int row, int column, int[][] matris) {
        // girilen sayilar matris de var mi
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                if (row == matris[i][0] && column == matris[i][1]) {
                    return true;
                }
            }

        }

        return false;
    }

    public void oyun() {
        Scanner input = new Scanner(System.in);

        int row, column, komsu, acilanKutucuk = 0, mayinsizkutuSayisi, konumIndex = 0;
        boolean findBomb = false;
        mayinsizkutuSayisi = (this.satir * this.stun) - (this.satir * this.stun) / 4;
        int[][] girilenKonumlar = new int[mayinsizkutuSayisi][2];
        for (int i = 0; i < girilenKonumlar.length; i++) {
            for (int j = 0; j < girilenKonumlar[i].length; j++) {
                girilenKonumlar[i][j] = -1;
            }
        }
        while (!findBomb && acilanKutucuk < mayinsizkutuSayisi) {
            System.out.println("Satir index degeri girin :");
            row = input.nextInt();
            System.out.println("Stun index degeri girin :");
            column = input.nextInt();
            if ((row >= this.satir || row < 0) || (column >= this.stun || column < 0)) {
                System.out.println("Hatali girdi tekrar deneyin");
                continue;
            }/////////////// girilen indexler bidaha girilirse uyarı vermeli

            /// daha önce girilen indexler bi matrisde tutulabilir
            else if (girilenKonum(row, column, girilenKonumlar)) {
                System.out.println("Bu konumu daha once girdiniz baska bi konum girin :");
                continue;

            }
            girilenKonumlar[konumIndex][0] = row;
            girilenKonumlar[konumIndex][1] = column;
            konumIndex++;

            if (isFind(row, column)) {
                findBomb = true;
                System.out.println("Game Over!!!!!!!");
            } else {
                // asagidaki yontemle int degeri char ddegiskene atadik
                komsu = komsuBulma(row, column);
                tarla[row][column] = (char) (komsu + '0');
                tarlaYazdir();
                hileliTarlayiYazdir();
                acilanKutucuk++;
            }
            if (acilanKutucuk >= mayinsizkutuSayisi) {

                System.out.println("Tebrikler Kazandiniz :) ");
                break;
            }
        }
    }

    public int komsuBulma(int row, int column) {
        // kullanicinin girdigi konumun komşularına bakmak için
        int mayinSayisi = 0;
        //bir kutunun max 8 komşusu vardır kendisiyle beraber 9 kutu eder biz burda
        // alınan konumun 1'er satir üstünü altını ve kendi satırını
        // 1 kolon solunu kendisini ve 1 kolon sağını kontrol ederek
        // tüm komşuları dolanmış oluyoruz
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = column - 1; j <= column + 1; j++) {
                if ((i >= 0 && j >= 0) && (i < this.satir && j < this.stun)) {
                    if (isFind(i, j)) {
                        System.out.println("Komsuda mayin var ");
                        mayinSayisi++;
                    }
                }

            }

        }

        return mayinSayisi;
    }


}
