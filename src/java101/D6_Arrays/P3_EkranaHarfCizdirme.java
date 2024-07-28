package java101.D6_Arrays;

/*
Ödev
Çok boyutlu diziler kullanılarak "yıldızlar" ile
ekrana "B" harfi yazan programı yazınız.
 */
public class P3_EkranaHarfCizdirme {
    public static void main(String[] args) {
        int[][] matris = new int[5][4]; // matris olusturuldu

        /// * yazılacak kosullar
        /*
        1 ) i ==0 || j ==0
        2 ) j ==4

        4 ) i == 1 ama j == 1 || j==2 atlama
        5 ) i == 2 ama j == 3 ise atlama
        6) i == 3 ama j == 1 || j == 2 atlama

         */

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {

                if (i == 1 && (j == 1 | j == 2)) {
                    System.out.print("   ");
                } else if (i == 2 && j == 3) {
                    System.out.print("   ");
                } else if (i == 3 && (j == 1 || j == 2)) {
                    System.out.print("   ");

                } else {
                    System.out.print(" * ");
                }


            }
            System.out.println();
        }


    }

}
