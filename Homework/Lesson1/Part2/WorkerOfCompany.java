public class WorkerOfCompany {
    public String name;
    public String age;
    public float salary;
    public String schedule;
    public boolean sex;

    private String chooseSchedule(String name){};
    private boolean chooseSex (String name) {};
    public String getName () {};
    public String getAge() {};
    public String getSalary (){};
    public setSchedule (String name) {
        schedule = chooseSchedule(name);
    };
    public setSalary (float avarage){
        salary = avarage;
    };
    public setSex (String name){
        sex = chooseSex(name);
    };
}
public class Cleaner extends WorkerOfCompany {
    public String uniform;
}
public class Secretary extends WorkerOfCompany {
    public int type_speed;
}
public class Programmer extends WorkerOfCompany {
    public String process_type;
    public String rang;
}
public class Supplier extends Cleaner {
    public String tool_set;
}
public class TeamLead extends Programmer {
    public String team;
}
public class CEO extends WorkerOfCompany {
    public String department;
}