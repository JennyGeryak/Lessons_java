package lesson2.part1;

/**
 * Created by geryak on 18.05.2017.
 * java
 */
public  class Menu{
    private int i=0;
    public  void showEmployees(Employee[] employees){
        System.out.println("Список сотрудников:");
        for (i=0; i<employees.length; i++){
            if(employees[i] instanceof Employee){
                System.out.println(employees[i].getName() +" - " + employees[i].getPosition());
            }
        }
    }
}
