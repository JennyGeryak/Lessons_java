package lesson2.part1;

/**
 * Created by geryak on 18.05.2017.
 * java
 */
    // наследуем класс Man
    public class Employee extends Man {
    private String position;
    private IdCard iCard;

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
}
