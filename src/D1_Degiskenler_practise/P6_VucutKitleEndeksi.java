package D1_Degiskenler_practise;

import java.util.Scanner;

public class P6_VucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy, kilo, vucutKitleEndeksi;
        System.out.println("Lütfen boyunuzu metre cinsinden girin : ");
        boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu girin : ");
        kilo = input.nextDouble();
        vucutKitleEndeksi = kilo / (boy * boy);
        System.out.println("Vücut kitle endeksiniz = " + vucutKitleEndeksi);
    }
}
