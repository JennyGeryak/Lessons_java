public class SchoolWorker{
    public String name;
    public String sex;
    public int age;

    public work(){};
    public rest(){};
}

public class Intern extends SchoolWorker{
    public boolean isOwnCabinet;
    public boolean isHasClass;
    public String[] knowledge;

    public checkNotebooks(){};
    public waterFlowers(){};
}

public class Teacher extends Intern{
    public short expiriense;
    public String[] skills;
    public String degree;

    public fillInJournal();
    public giveHomework();
}

public class Principal extends Teacher{
    public String brandOfCar;
    public boolean barInCabinet;
    public int secretaryCount;

    public askSomeCoffee();
    public takeBrabe();
}

