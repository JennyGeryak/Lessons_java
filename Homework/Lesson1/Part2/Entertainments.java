public class Entertainments {

    Entertainments() {

    }
    public static void main (String args[ ])
    {
        System.out.println( "hi, this is class Entertainments" );
    }
    private String name;
    private String place;
    private int date;
    private int active_entertainment;
    private int passive_entertainment;
    private int quantity;
    private int price;
    private long time;
    private boolean music;
    private boolean games;
    private boolean reading;
    private boolean sports;
    private boolean shopping;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getActive_entertainment() {
        return active_entertainment;
    }

    public void setActive_entertainment(int active_entertainment) {
        this.active_entertainment = active_entertainment;
    }

    public int getPassive_entertainment() {
        return passive_entertainment;
    }

    public void setPassive_entertainment(int passive_entertainment) {
        this.passive_entertainment = passive_entertainment;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    private boolean isMusic (){ return this.music; }
    private boolean isGames (){ return this.games; }
    private boolean isReading (){ return this.reading; }
    private boolean isSports (){ return this.sports; }
    private boolean isShopping (){ return this.shopping; }
}