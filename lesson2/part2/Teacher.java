package lesson2.part2;

/**
 * Created by geryak on 22.05.2017.
 * java
 */
public class Teacher{
    private String name;
    private int age;
    private String lesson;
    private int workHour;
    private String subject;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSubject() {
        return subject;
    }

    public String getLesson() {
        return lesson;
    }

    public int getWorkHour() {
        return workHour;
    }
    public Teacher(String name, String lesson){
        this.name = name;
        this.lesson = lesson;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }
    public void fillInJournal(){



    };
    public void giveHomework(){

    };
    public void checkNotebooks(){

    };
    public void giveLesson(){

    };

    public void remove(Teacher teacher) {
    }

    public void add(Teacher teacher) {
    }


    public String setLesson() {
        return lesson;
    };
}
