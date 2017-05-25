package lesson2.part2;

import java.util.List;

/**
 * Created by geryak on 22.05.2017.
 * java
 */
public class Course extends Faculty {
    private String name;
    private int courseID;
    private Student[] students;
    private Teacher[] teachers;
    private List<Student> student;
    private List<Teacher> teacher;

    public Course(String name, int courseID, List<Student> student, List<Teacher> teacher){
        super();
        this.name = name;
        this.courseID = courseID;
        this.student = student;
        this.teacher = teacher;
    }

    public Course(String name, int numberOfStudent) {
        super(name,student, allTeacher, numberOfStudent);
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
