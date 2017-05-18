package lesson2.part1;

/**
 * Created by geryak on 18.05.2017.
 * java
 */
    // наследуем класс Man
    public class Employee extends Man {
    private String position;

    // создаем и конструктор
    public Employee(String n, String s, String p) {
        name = n;
        surname = s;
        position = p;
    }

    public void setPosition(String newProfession) {
        position = newProfession;
    }

    public String getPosition() {
        return position;
    }
}
