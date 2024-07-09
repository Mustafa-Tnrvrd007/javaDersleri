package D5_javaOOP.P1_OgrenciBilgiSistemi;

/*




Ödev

Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya
etkisini  her ders için ayrı ayrı belirtin.
Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.

Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise
sınav notunun etkisi %80'dir.

Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel
ortalamaya etkisi şu şekilde hesaplanır :

Fizik Ortalaması : (90 * 0.20) + (60* 0.80);
 */
public class Main {
    public static void main(String[] args) {
        Teacher ogretmen1 = new Teacher("Ahmet", "Mat", "00556434523");
        Teacher ogretmen2 = new Teacher("Ayşe", "Fiz", "003735272323");
        Teacher ogretmen3 = new Teacher("Aylin", "Kim", "002312531257");

//        System.out.println(ogretmen3.name);
//        System.out.println(ogretmen3.branch);
//        System.out.println(ogretmen3.phoneNumber);

        Course ders1 = new Course("Matematik", "CS50", "Mat");
        ders1.addTeacher(ogretmen1);
        Course ders2 = new Course("Fizik", "CS40", "Fiz");
        ders2.addTeacher(ogretmen2);
        Course ders3 = new Course("Kimya", "CS30", "Kim");
        ders3.addTeacher(ogretmen3);

        System.out.println("\n\n\n");
        ders1.printTeacher();
        ders2.printTeacher();
        ders3.printTeacher();
        System.out.println("\n\n\n");

        // Student(String name, int studentNo, String classes,
        //            Course course1, Course course2, Course course3)

        Student s1 = new Student("Ali", 121, "CS50", ders1, ders2, ders3);
        Student s2 = new Student("Ayça", 147, "CS40", ders1, ders2, ders3);
        Student s3 = new Student("Deniz", 190, "CS30", ders1, ders2, ders3);

        System.out.println(s1.name);
        System.out.println(s1.studentNo);
        System.out.println(s1.classes);

        s1.addBulkExamNote(80, 90, 70,60,80,90);
        s1.isPass();

        System.out.println();
        s2.addBulkExamNote(60, 75, 50,83,98,100);
        s2.isPass();
        s3.addBulkExamNote(54, 47, 66,59,72,84);
        s3.isPass();







    }
}
