public class MusicInstruments {

    MusicInstruments() {

    }
    public MusicInstruments(String name, String group, int price,long exploitation_period, long year_of_manufacture)
    {
        this.name = name;
        this.group = group;
        this.price = price;
        this.exploitation_period = exploitation_period;
        this.year_of_manufacture = year_of_manufacture; }

    public MusicInstruments(String group, long year_of_manufacture) {

    }
    public static void main (String args[ ])

    {
        MusicInstruments Instrument1 = new MusicInstruments("Brass Pipe", "brass", 10000, "10", "2017");
        MusicInstruments Instrument2 = new MusicInstruments("brass", "2017");
        System.out.println("I am playing on music instument.\n Its name is "+Instrument1.getName());

        Instrument2.setName("Cool brass pipe");
        System.out.println("I am playing on another music instrument.\n Its name is "+Instrument2.getName());
    }

    private String name;
    private String model;
    private String group;
    private int wieght;
    private int height;
    private int volume;
    private int price;
    private long exploitation_period;
    private long year_of_manufacture;
    private int tuned;
    private int detuned;
    private int period;
    private long year;
    private boolean string;
    private boolean woodwind;
    private boolean brass;
    private boolean percussion;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getWieght() {
        return wieght;
    }

    public void setWieght(int wieght) {
        this.wieght = wieght;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getExploitation_period() {
        return exploitation_period;
    }

    public void setExploitation_period(long exploitation_period) {
        this.exploitation_period = exploitation_period;
    }

    public long getYear_of_manufacture() {
        return year_of_manufacture;
    }

    public void setYear_of_manufacture(long year_of_manufacture) {
        this.year_of_manufacture = year_of_manufacture;
    }

    public int getTuned() {
        return tuned;
    }

    public void setTuned(int tuned) {
        this.tuned = tuned;
    }

    public int getDetuned() {
        return detuned;
    }

    public void setDetuned(int detuned) {
        this.detuned = detuned;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    private boolean isString (){ return this.string; }
    private boolean isWoodwind (){ return this.woodwind; }
    private boolean isBrass (){ return this.brass; }
    private boolean isPercussion (){ return this.percussion; }

}