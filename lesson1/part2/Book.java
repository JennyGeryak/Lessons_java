public class Book{

    public Book() {

    }

    public Book(String name, String author, int year, String ganre, String publisher, String country)
    {
        this.name = name;
        this.author = author;
        this.year = year;
        this.ganre = ganre;
        this.publisher = publisher;
        this.country = country; }

    public Book(String name, String author) {

    }

    public static void main (String args[ ])

    {
        Book myBook1 = new Book("Kobzar", "Shevchenko", 1840, "poetry", "Korbush", "Ukraine");
        Book myBook2 = new Book("Harry Potter", "Rowling");
        System.out.println("Jane is reading a book.\n Its name is "+myBook1.getName());

        myBook2.setName("Harry Potter and the philosopher's stone");
        System.out.println("Jane is reading another book.\n Its name is "+myBook1.getName());
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGanre() {
        return ganre;
    }

    public void setGanre(String ganre) {
        this.ganre = ganre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String[] getLocalization() {
        return localization;
    }

    public void setLocalization(String[] localization) {
        this.localization = localization;
    }


}