public class MusicInstruments {
    public String name;
    public String model;
    public String group;
    public int wieght;
    public int height;
    public int volume;
    public int price;
    public long exploitation_period;
    public long year_of_manufacture;
    private int tuned;
    private int detuned;
    public int period;
    public long year;

    public float getPrice (){};
    private boolean isString (){};
    private boolean isWoodwind (){};
    private boolean isBrass (){};
    private boolean isPercussion (){};
    public String getName (){};
    public String getModel(){};
    public int getWieght(){};
    public int getHeight(){};
    private setExploitationPeriod(new_period){
        period = new_period;
    }
    private setYear(new_year){ year = new_year; }
}