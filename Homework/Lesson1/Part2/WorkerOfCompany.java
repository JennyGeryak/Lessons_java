public class WorkerOfCompany {
    public static void main (String args[ ])
    {
        System.out.println( "hi, this is class WorkerOfCompany" );
    }
    private String name;
    private String age;
    private float salary;
    private String schedule;
    private boolean sex;
    private boolean ready_for_work = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
        this.ready_for_work = true;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    private String chooseSchedule(String name){};
    private boolean chooseSex (String name) {};

}
public class Cleaner extends WorkerOfCompany {
    private String uniform;

    public String getUniform() {
        return uniform;
    }

    public void setUniform(String uniform) {
        this.uniform = uniform;
    }
}
public class Secretary extends WorkerOfCompany {
    private int type_speed;

    public int getType_speed() {
        return type_speed;
    }

    public void setType_speed(int type_speed) {
        this.type_speed = type_speed;
    }
}
public class Programmer extends WorkerOfCompany {
    private String process_type;
    private String rang;

    public String getProcess_type() {
        return process_type;
    }

    public void setProcess_type(String process_type) {
        this.process_type = process_type;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }
}
public class Supplier extends Cleaner {
    private String tool_set;

    public String getTool_set() {
        return tool_set;
    }

    public void setTool_set(String tool_set) {
        this.tool_set = tool_set;
    }
}
public class TeamLead extends Programmer {
    private String team;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
public class CEO extends WorkerOfCompany {
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}