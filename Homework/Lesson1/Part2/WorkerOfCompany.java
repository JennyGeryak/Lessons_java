public class WorkerOfCompany {
    private String name;
    private String age;
    private float salary;
    private String schedule;
    private boolean sex;

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
    private String uniform;
}
public class Secretary extends WorkerOfCompany {
    private int type_speed;
}
public class Programmer extends WorkerOfCompany {
    private String process_type;
    private String rang;
}
public class Supplier extends Cleaner {
    private String tool_set;
}
public class TeamLead extends Programmer {
    private String team;
}
public class CEO extends WorkerOfCompany {
    private String department;
}