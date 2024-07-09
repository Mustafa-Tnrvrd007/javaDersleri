package D5_javaOOP.P1_OgrenciBilgiSistemi;

/*
Course Sınıfı Özellikleri :

Nitelikler : name,code,prefix,note,Teacher
Metotlar : Course() , addTeacher() , printTeacher()
 */
public class Course {
    String name;
    String code;
    String prefix;
    double note;
    int sozluNotu;
    Teacher teacher;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;

    }

    public void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.teacher = teacher;
            System.out.println(teacher.name+" Ogretmen "+this.prefix+" kodlu derse atandi.");
        } else {
            System.out.println("Ogretmenin bransi bu dersle uyusmuyor !");
        }
    }

    public void printTeacher() {
        if (this.teacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + this.teacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }

    }

}
