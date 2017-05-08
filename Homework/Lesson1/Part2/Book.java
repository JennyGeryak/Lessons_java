public class Book{
    private String name;
    private String author;
    private int year;
    private String ganre;
    private String publisher;
    private String country;
    private long isbn;
    private int quantity;
    private String cover;
    private String[] localization;

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