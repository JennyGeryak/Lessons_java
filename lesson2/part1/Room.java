package lesson2.part1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;

/**
 * Created by geryak on 18.05.2017.
 */
public class Room {
    private int number;
    public Room(int n){
        number = n;
    }
    public static void main(String[] args) throws ParseException {

        Employee sysEngineer = new Employee("John", "Connor", "Manager", sysEngineer);
        IdCard card = new IdCard(123);
        card.setDateExpire(new SimpleDateFormat("yyyy-MM-dd").parse("2015-12-31"));
        sysEngineer.setIdCard(card);
        Room room101 = new Room(101);
        Room room321 = new Room(321);
        sysEngineer.setRoom(room101);
        sysEngineer.setRoom(room321);
        System.out.println(sysEngineer.getName() +" работает в должности "+ sysEngineer.getPosition());
        System.out.println("Удостовирение действует до " + sysEngineer.getIdCard().getDateExpire());
        System.out.println("Может находиться в помещеньях:");
        Iterator iter = sysEngineer.getRoom().iterator();
        while(iter.hasNext()){
            System.out.println( ((Room) iter.next()).getNumber());
        }
    }
    public void setNumber(int newNumber){
        number = newNumber;
    }
    public int getNumber(){
        return number;
    }
}
