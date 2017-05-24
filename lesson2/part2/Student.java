package lesson2.part2;


/**
 * Created by geryak on 22.05.2017.
 * java
 */
public class Student{

    private String name;

    private int StudentID;
    public Student(String name, int StudentID){
        this.name = name;
        this.StudentID = StudentID;
    }

    public void study(){

    };

    public void doHomework(){

    };
    public void getKnowledge(){

    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }
}
