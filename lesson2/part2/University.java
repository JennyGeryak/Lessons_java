package lesson2.part2;

/**
 * Created by geryak on 22.05.2017.
 * java
 */
public class University extends Establishment{
    private Student[] student;
    private Faculty[] faculty;
    private int phone;

    public University(String name,String address){
        this.name = name;
        this.address = address;
    }

    public void addStudent(Student student) {
        this.student.add(student);
    }
    public String removeStudent (Student student) {
        this.student.remove(student);
    }
    public Student[] getStudent() {
        return student;
    }
    public void addFaculty (Faculty faculty) {
        this.faculty.add(faculty);
    }
    public void removeFaculty (Faculty faculty) {
        this.faculty.remove(faculty);
    }
    public Faculty[] getFaculty() {
        return faculty;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }

}
