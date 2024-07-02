package D1_javaDegiskenler_practise;

import java.util.Scanner;

public class P3_Ucgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve
        // hipotenüsü hesaplayan programı yazın.
        /*
        int kenar1 , kenar2 ;
        double hipotenus;

        System.out.println("Dik üçgenin 1. kenarını girin : ");
        kenar1 = input.nextInt();

        System.out.println("Dik üçgenin 2. kenarını girin : ");
        kenar2 = input.nextInt();
        hipotenus = Math.sqrt(kenar1*kenar1 + kenar2*kenar2); // kare kök alma

        System.out.println(" Birinci kenarı "+ kenar1 +" ve ikinci kenarı "
                + kenar2+" olan dik üçgenin hipotenüsü = "+ hipotenus);

        */


        int a,b,c; // üçgenin kenarları
        System.out.println("Birinci kenarı giriniz : ");
        a = input.nextInt();
        System.out.println("Ikinci kenarı giriniz : ");
        b = input.nextInt();
        System.out.println("Ucuncu kenarı giriniz : ");
        c = input.nextInt();
        /*
        Heron Formülünde, ilk önce S'in değerini bulmamız gerekiyor.
        S bu üçgenin çevresinin 2'ye bölümüyle bulunur a+b+c/2 S'i bulun,
        ve sonra üçgeninizin alanı S * (S-a) * (S-b)* (S-c)'nin kareköküne eşit olacak.
        İşte Heron Formülü bu kadar basit.
         */
        double s = (a+b+c)/2 , alan;
        alan = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Üçgenin alanı = " + alan);



    }
}
