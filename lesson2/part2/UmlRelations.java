package lesson2.part2;

/**
 * Created by geryak on 25.05.2017.
 * java
 */
public class UmlRelations {
    public static void main(String[] args){
        University Shevchenka = new University("University", "Red Armi str.");
        Student Vera = new Student("Vera Selezneva", 2343);
        Student Senya = new Student("Senya Kuznetsov", 3454);
        Teacher Galina = new Teacher("Teacher", "Mathematics");
        Galina.setLesson("Pedagogic");
        Faculty Pedagogic = new Faculty("Faculty","some student","some teachers",300);
        Course FirstCourse = new Course("Course",12345,)

        System.out.println(Shevchenka.getName() + "consists of" + Pedagogic.getName());
        System.out.println(Pedagogic.getName() + "have some");

    }
}
