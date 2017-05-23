package lesson2.part2;

/**
 * Created by geryak on 22.05.2017.
 * java
 */
public class Course extends Faculty {
    private String name;
    private int courseID;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }
}
