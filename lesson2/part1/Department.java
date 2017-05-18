package lesson2.part1;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by geryak on 18.05.2017.
 * java
 */
public class Department {
    private String name;
    private Set employees = new HashSet();
    public Department(String n, Employee sysEngineer){
        name = n;
        Department programmersDepartment = new Department("Программисты", sysEngineer);
        programmersDepartment.addEmployee(sysEngineer);
        System.out.println("Относится к отделу "+sysEngineer.getDepartment().getName());
    }
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
    public void addEmployee(Employee newEmployee){
        employees.add(newEmployee);
        // связываем сотрудника с этим отделом
        newEmployee.setDepartment(this);
    }
    public Set getEmployees(){
        return employees;
    }
    public void removeEmployee(Employee e){
        employees.remove(e);
    }
}
