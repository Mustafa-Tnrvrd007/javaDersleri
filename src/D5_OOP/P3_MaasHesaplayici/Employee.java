package D5_OOP.P3_MaasHesaplayici;

/*
Java'da "Employee" adında fabrika çalışanlarını temsil eden ve
metotları ile çalışanların maaşlarını hesaplayan bir sınıf yazmalısınız.
Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır.

Sınıfın Nitelikleri

name : Çalışanın adı ve soyadı
salary : Çalışanın maaşı
workHours : Haftalık çalışma saati
hireYear : İşe başlangıç yılı
 */
public class Employee {
    String fullName;
    double salary;
    int workHours;
    int hireYear;

    //Employee (): Kurucu metot olup 4 parametre alacaktır.

    Employee(String firstName, String surName, int salary, int workHours, int hireYear) {
        this.fullName = firstName + " " + surName;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;


    }

    /*
    tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
    Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
    Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
     */
    public double tax() { // vergi orani
        if (this.salary > 1000) {
            return (0.03 * this.salary);
        } else {
            return 0.0 * salary;
        }
    }

    /*
    bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan
    çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
     */
    public int bonus() {
        if (this.workHours > 40) {
            return ((this.workHours - 40) * 800); // bonus ücret
        } else {
            return 0;
        }

    }

    /*
    raiseSalary() : Çalışanın işe başlangıç yılına göre
    maaş artışını hesaplayacaktır. Şuan ki yılı **** olarak alın.

        Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
        Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
        Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
     */
    public double raiseSalary() { // zam oranları
        /// şu anki yıl 2024
        int curretnYear = 2024, year;
        year =  curretnYear - this.hireYear;

        if (year < 10) {
            return 0.05 * this.salary;
        } else if (year >= 10 && year < 20) {
            return 0.1 * this.salary;
        } else {
            return 0.15 * this.salary;
        }

    }

    // print() : Çalışana ait bilgileri ekrana bastıracaktır.
    /*
    toString() : Çalışana ait bilgileri ekrana bastıracaktır.
Örnek :

Adı : kemal -
Maaşı : 2000.0 -
Çalışma Saati : 45 -
Başlangıç Yılı : 1985 -
Vergi : 60.0 -
Bonus : 150.0 -
Maaş Artışı : 300.0
Vergi ve Bonuslar ile birlikte maaş : 2090.0
Toplam Maaş : 2390.0
net maas = salary - vergi +bonus +zam
     */
    public void print() {
        System.out.println("Isim : " + this.fullName);
        System.out.println("Maas : " + this.salary);
        System.out.println("Haftalik calisma saati : " + this.workHours);
        System.out.println("Ise girme yili : " + this.hireYear);
        System.out.println("Vergi " + tax() + " TL");
        System.out.println("Bonus ucret : " + bonus() + " TL");
        System.out.println("Maas zammi : " + raiseSalary() + " TL");
        System.out.println("Net maas : " + totalSalary());
        System.out.println("");
    }

    public double totalSalary() {
        //net maas = salary - vergi +bonus +zam

        double total = this.salary - tax() + bonus() + raiseSalary();
        this.salary = total;
        return this.salary;
    }


}
