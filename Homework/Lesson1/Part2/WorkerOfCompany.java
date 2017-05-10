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

    private String chooseSchedule(String name){ return this.schedule; }
    private boolean chooseSex (String name) { return this.sex; }

}
