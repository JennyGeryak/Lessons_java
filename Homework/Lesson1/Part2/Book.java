public class Book{
    public String name;
    public String author;
    public int year;
    public String ganre;
    public String publisher;
    public String country;
    public long isbn;
    public int quantity;
    public String cover;
    public String[] localization;

    public addLocalization(String local){};
    public String getName () {
        return name;
    };
    public setName (String new_name) {
        name = new_name;
    };
    public String getAuthor () {
        return author;
    };
    public setAuthor (String new_author) {
        author = new_author;
    };
    public String getGanre () {
        return ganre;
    };
    public setGanre (String new_ganre) {
        ganre = new_ganre;
    };
    public String getIsbn() {
        return isbn;
    };
    public setIsbn (String new_isbn) {
        isbn = new_isbn;
    };
    public String getCover () {return cover};
}