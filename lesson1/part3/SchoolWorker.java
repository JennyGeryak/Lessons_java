public class SchoolWorker{
    public String name;
    public String sex;
    public int age;

    public void work(){
        System.out.println("working");
    };
    public void rest(){
        System.out.println("having a rest");
    };
}

public class Intern extends SchoolWorker{
    public boolean isOwnCabinet;
    public boolean isHasClass;
    public String[] knowledge;

    public void checkNotebooks(){
        System.out.println("checking notebooks");
    };
    public void waterFlowers(){
        System.out.println("watering flowers");
    };
}

public class Teacher extends Intern{
    public short expiriense;
    public String[] skills;
    public String degree;

    public void fillInJournal(){
        System.out.println("filling in journal");
    };
    public void giveHomework(){
        System.out.println("giving homework");
    };
}

public class Principal extends Teacher{
    public String brandOfCar;
    public boolean barInCabinet;
    public int secretaryCount;

    public void askSomeCoffee(){
        System.out.println("asking coffee");
    };
    public void takeBrabe(){
        System.out.println("taking brabe");
    };
}

