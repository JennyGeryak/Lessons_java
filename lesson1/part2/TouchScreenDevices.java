public class TouchScreenDevices {

    TouchScreenDevices() {

    }
    public TouchScreenDevices(String name, String type, int price,long date_of_manufacture)
    {
        this.name = name;
        this.type = type;
        this.price = price;
        this.exploitation_period = exploitation_period;
    }

    public TouchScreenDevices(int price, long date_of_manufacture) {

    }
    public static void main (String args[ ])

    {
        TouchScreenDevices Device1 = new TouchScreenDevices("Telephone", "Smartphone", 10000, "2");
        TouchScreenDevices Device2 = new TouchScreenDevices("10000", "2");
        System.out.println("My device really help me in life.\n Its name is "+Device1.getType());

        Device2.setName("Tablet");
        System.out.println("My device really help me in life. \n Its name is "+Device2.getName());
    }

    private String name;
    private String model;
    private String type;
    private boolean phone;
    private boolean tablet;
    private int price;
    private long date_of_manufacture;
    private int size;
    private int detuned;
    private int increased_screen_sensitivity;
    private int working_device;
    private int broken_device;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getDate_of_manufacture() {
        return date_of_manufacture;
    }

    public void setDate_of_manufacture(long date_of_manufacture) {
        this.date_of_manufacture = date_of_manufacture;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getDetuned() {
        return detuned;
    }

    public void setDetuned(int detuned) {
        this.detuned = detuned;
    }

    public int getIncreased_screen_sensitivity() {
        return increased_screen_sensitivity;
    }

    public void setIncreased_screen_sensitivity(int increased_screen_sensitivity) {
        this.increased_screen_sensitivity = increased_screen_sensitivity;
    }

    public int getWorking_device() {
        return working_device;
    }

    public void setWorking_device(int working_device) {
        this.working_device = working_device;
    }

    public int getBroken_device() {
        return broken_device;
    }

    public void setBroken_device(int broken_device) {
        this.broken_device = broken_device;
    }

    private boolean isPhone (){ return this.phone; };
    private boolean isTablet (){ return this.tablet; };

}