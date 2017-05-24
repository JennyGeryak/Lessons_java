package lesson2.part2;

/**
 * Created by geryak on 22.05.2017.
 * java
 */
public class Faculty{
    private String name;
    private int numberOfStudent;
    private Teacher teacher;
    private String allTeacher;

    public void setName(String name) {
        this.name = name;
    }
    public int getNumberOfStudent() {
        return numberOfStudent;
    }
    public void addTeacher(Teacher teacher) {
        this.teacher.add(teacher);
    };
    public void removeTeacher(Teacher teacher){
        this.teacher.remove(teacher);
    };
    public String getTeacher() {
        return teacher;
    }
    public String getAllTeacher() {
        return allTeacher;
    }
}
