public class Film {

    Film() {

    }

    public static void main (String args[ ])
    {
        System.out.println( "hi, this is class Film" );
    }

    private String name;
    private int year;
    private String director;
    private String producer;
    private String genre;
    private short rate;
    private String studio;
    private String country;
    private short rated;
    private String [] avards;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public short getRate() {
        return rate;
    }

    public void setRate(short rate) {
        this.rate = rate;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public short getRated() {
        return rated;
    }

    public void setRated(short rated) {
        this.rated = rated;
    }

    public String[] getAvards() {
        return avards;
    }

    public void setAvards(String[] avards) {
        this.avards = avards;
    }


}