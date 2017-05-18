package lesson2.part1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by geryak on 18.05.2017.
 * java
 */
public class IdCard {
    private Date dateExpire;
    private int number;
    private IdCard(int n, Employee sysEngineer) throws ParseException {
        number = n;

        IdCard card = new IdCard(123, sysEngineer);
        card.setDateExpire(new SimpleDateFormat("yyyy-MM-dd").parse("2015-12-31"));
        sysEngineer.setIdCard(card);
        System.out.println(sysEngineer.getName() +" работает в должности "+ sysEngineer.getPosition());
        System.out.println("Удостовирение действует до " + new SimpleDateFormat("yyyy-MM-dd").format(sysEngineer.getIdCard().getDateExpire()) );
    }

    public void setNumber(int newNumber){
        number = newNumber;
    }
    public int getNumber(){
        return number;
    }
    private void setDateExpire(Date newDateExpire){
        dateExpire = newDateExpire;
    }
    public Date getDateExpire(){
        return dateExpire;
    }

}