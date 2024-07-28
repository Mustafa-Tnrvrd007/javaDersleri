package java101.D8_BitirmeProjesi;

import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {
    int satir;
    int stun;
    char[][] tarla;
    int[][] mayin;
    int mayinsizkutuSayisi;
    int[][] girilenKonumlar;
    int acilanKutucukSayisi;


    MayinTarlasi(int satir, int stun) {
        this.satir = satir;
        this.stun = stun;
        this.tarla = new char[satir][stun];
        this.mayin = new int[(satir * stun) / 4][2];

        matrisSilme(mayin);

        rastgeleMayinAtama(this.satir, this.stun, this.mayin);// mayinlari rast gele atadik

        this.mayinsizkutuSayisi = (this.satir * this.stun) - (this.satir * this.stun) / 4;
        this.girilenKonumlar = new int[mayinsizkutuSayisi][2];
        matrisSilme(girilenKonumlar);


    }

    public void matrisSilme(int[][] matris) {
        for (int i = 0; i < matris.length; i++) { // matrise -1 atadik
            for (int j = 0; j < matris[i].length; j++) {
                matris[i][j] = -1;
            }
        }
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

    public void rastgeleMayinAtama(int satir, int stun, int[][] matris) {
        // mayın matrisinin satir sayisi mayin sayisini belirler
        // random sayisi matrisin satir ve stun degerlerini geçmemeli
        Random random = new Random(); // bunun için Random kütüphanesi dahil ettim
        int index = 0, row, column;

        while (index < matris.length) {

            row = random.nextInt(satir);
            column = random.nextInt(stun);
            if (isFind(row, column, this.mayin)) {
                continue;
            } else {

                this.mayin[index][0] = row;
                this.mayin[index][1] = column;

            }
            index++;

        }


    }

    public void hileliTarlayiYazdir() {
        System.out.println("Hileli tarla");
        for (int i = 0; i < this.satir; i++) {
            for (int j = 0; j < this.stun; j++) {

                if (isFind(i, j, this.mayin)) {
                    System.out.print("\t" + "*");

                } else {
                    System.out.print("\t" + this.tarla[i][j]);

                }


            }
            System.out.println();
        }
    }


    public boolean isFind(int row, int column, int[][] matris) {
        // girilen sayilar matris de var mi
        for (int i = 0; i < matris.length; i++) {
            if (row == matris[i][0] && column == matris[i][1]) {
                return true;
            }

        }

        return false;

    }

    public void acilanKutucuk(int row, int column, int index) {

        /// kullanicidan alinan konumlari matrise atadik
        girilenKonumlar[index][0] = row;
        girilenKonumlar[index][1] = column;

        this.acilanKutucukSayisi++;

    }

    public void oyun() {
        Scanner input = new Scanner(System.in);
        int row, column, komsu, konumIndex = 0;
        this.acilanKutucukSayisi = 0;

        while (true) {
            System.out.println("Satir index degeri girin :");
            row = input.nextInt();
            System.out.println("Stun index degeri girin :");
            column = input.nextInt();

            if ((row >= this.satir || row < 0) || (column >= this.stun || column < 0)) {
                System.out.println("Hatali girdi tekrar deneyin");
                continue;
            } else if (isFind(row, column, girilenKonumlar)) {
                System.out.println("Bu konumu daha once girdiniz baska bi konum girin :");
                continue;
            } else if (isFind(row, column, this.mayin)) {
                System.out.println("Game Over!!!!!!!");
                break;
            } else {
                acilanKutucuk(row, column, konumIndex);
                konumIndex++;
                komsu = komsuBulma(row, column);

                // asagidaki yontemle int degeri char degiskene atadik
                this.tarla[row][column] = (char) (komsu + '0');
                tarlaYazdir();
                hileliTarlayiYazdir();

            }
            if (this.acilanKutucukSayisi >= mayinsizkutuSayisi) {
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
                    if (isFind(i, j, this.mayin)) {
                        System.out.println("Komsuda mayin var ");
                        mayinSayisi++;
                    }
                }

            }

        }

        return mayinSayisi;
    }


}
