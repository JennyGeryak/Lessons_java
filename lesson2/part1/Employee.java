package lesson2.part1;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by geryak on 18.05.2017.
 * java
 */
    // наследуем класс Man
    public class Employee extends Man {
    private String position;
    private IdCard iCard;
    private Set room = new HashSet();
    private Department department;

    // создаем и конструктор
    public Employee(String n, String s, String p) {
        name = n;
        surname = s;
        position = p;
    }

    public void setPosition(String newPosition){
        position = newPosition;
    }
    public String getPosition(){
        return position;
    }
    public void setIdCard(IdCard c){
        iCard = c;
    }
    public IdCard getIdCard(){
        return iCard;
    }
    public void setRoom(Room newRoom){
        room.add(newRoom);
    }
    public Set getRoom(){
        return room;
    }
    public void deleteRoom(Room r){
        room.remove(r);
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
