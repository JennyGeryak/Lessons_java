public class WorkerOfCompany {

    WorkerOfCompany() {

    }
public WorkerOfCompany(String name, String age, float salary, String schedule, boolean sex)
        {
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.schedule = schedule;
            this.sex = sex;
        }

    public WorkerOfCompany(String name, boolean sex ) {

        }
        public static void main (String args[ ])

        {
            WorkerOfCompany Worker1 = new WorkerOfCompany("Programmer", "30 years", 10000, "9.00 - 18.00", "man");
            WorkerOfCompany Worker2 = new WorkerOfCompany("QA-Engineer", "woman");
            System.out.println("He is working at company on position \n "+Worker1.getName());

            Worker2.setName("QA-Engineer");
            System.out.println("I am working at company on position \n "+Worker2.getName());
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
