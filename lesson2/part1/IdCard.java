package lesson2.part1;

/**
 * Created by geryak on 18.05.2017.
 */
public class IdCard {
    private Date dateExpire;
    private int number;
    public IdCard(int n){
        number = n;
    }
    public void setNumber(int newNumber){
        number = newNumber;
    }
    public int getNumber(){
        return number;
    }
    public void setDateExpire(Date newDateExpire){
        dateExpire = newDateExpire;
    }
    public Date getDateExpire(){
        return dateExpire;
    }

}
