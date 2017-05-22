package lesson2.part2;

/**
 * Created by geryak on 22.05.2017.
 * java
 */
public class Faculty extends University {

    private String name;
    private int numberOfStudent;
    private String teacher;
    private String allTeacher;

    public void setName(String name) {
        this.name = name;
    }
    public int getNumberOfStudent() {
        return numberOfStudent;
    }
    public String addTeacher() {
        return teacher;
    };
    public String removeTeacher(){
        return teacher;
    };
    public String getTeacher() {
        return teacher;
    }
    public String getAllTeacher() {
        return allTeacher;
    }
}
