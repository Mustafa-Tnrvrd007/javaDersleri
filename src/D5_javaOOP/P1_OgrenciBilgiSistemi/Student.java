package D5_javaOOP.P1_OgrenciBilgiSistemi;

/*
Student Sınıfı Özellikleri :

Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()

 */
public class Student {
    String name;
    int studentNo;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    boolean isPass;
    double avarage;

    Student(String name, int studentNo, String classes,
            Course course1, Course course2, Course course3) {
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int course1, int sozlu1, int course2, int sozlu2, int course3, int sozlu3) {

        if (course1 >= 0 && course1 <= 100) {
            this.course1.note = (course1 * 0.8 + sozlu1 * 0.2);

        }

        if (course2 >= 0 && course2 <= 100) {
            this.course2.note = (course2 * 0.8 + sozlu2 * 0.2);


        }

        if (course3 >= 0 && course3 <= 100) {
            this.course3.note = (course3 * 0.8 + sozlu3 * 0.2);


        }


    }

    public void isPass() {

        if (this.course1.note == 0 || this.course2.note == 0 || this.course3.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            printNote();

            this.isPass = isCheckPass();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }


    }

    public void calcAvarage() {
        this.avarage = (this.course1.note + this.course2.note + this.course3.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.course1.note);
        System.out.println("Fizik Notu : " + this.course2.note);
        System.out.println("Kimya Notu : " + this.course3.note);
    }

}
