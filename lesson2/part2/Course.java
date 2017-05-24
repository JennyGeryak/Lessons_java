package lesson2.part2;

/**
 * Created by geryak on 22.05.2017.
 * java
 */
public class Course extends Faculty {
    private String name;
    private int courseID;
    private Student[] students;
    private Teacher[] teachers;

    public Course(String name, int courseID){
        this.name = name;
        this.courseID = courseID;
    }

    public void addStudent(Student student) {
        this.student.add(student);
    }
    public String removeStudent (Student student) {
        this.student.remove(student);
    }

    public void addTeacher(Teacher teacher) {
        this.teacher.add(teacher);
    };
    public void removeTeacher(Teacher teacher){
        this.teacher.remove(teacher);
    };

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
