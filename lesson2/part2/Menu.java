package lesson2.part2;

/**
 * Created by geryak on 25.05.2017.
 * java
 */
public class Menu {
    private int i=0;
    public  void showStudent(Student[] students){
        System.out.println("Список студентов:");
        for (i=0; i<students.length; i++){
            if(students[i] instanceof Student){
                System.out.println(students[i].getName() +" - " + students[i].getPosition());
            }
        }
    }
}
