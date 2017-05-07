public class Film {
    public String name;
    public int year;
    public String director;
    public String producer;
    public String ganre;
    public short rate;
    public String studio;
    public String country;
    public short rated;
    public String [] avards;

    public String getName () {
        return name;
    };
    public setName (String new_name) {
        name = new_name;
    };
    public int getYear () {
        return year;
    };
    public setYear (int new_year) {
        year = new_year;
    };
    public String getDirector () {
        return director;
    };
    public setDirector (String new_director) {
        director = new_director;
    };
    public String getProducer () {
        return producer;
    };
    public setProducer (String new_producer) {
        producer = new_producer;
    };
    public String getGanre () {
        return ganre;
    };
    public setGanre (String new_ganre) {
        ganre = new_ganre;
    };
}