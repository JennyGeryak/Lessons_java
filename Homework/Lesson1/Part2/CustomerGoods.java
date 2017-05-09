public class CustomerGoods {
    private String name;
    private String category;
    private int wieght;
    private int height;
    private int width;
    private int length;
    private long date_of_manufacture;
    private long shelf_life;
    private int barcode;
    private String product_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public long getDate_of_manufacture() {
        return date_of_manufacture;
    }

    public void setDate_of_manufacture(long date_of_manufacture) {
        this.date_of_manufacture = date_of_manufacture;
    }

    public long getShelf_life() {
        return shelf_life;
    }

    public void setShelf_life(long shelf_life) {
        this.shelf_life = shelf_life;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    private boolean isFresh (){};
    private boolean isAvailible (){};
    public buy (){};

}