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

    public float getPrice (){};
    private boolean isFresh (){};
    private boolean isAvailible (){};
    public buy (){};
    public String getName (){};
    public String getCategory(){};
    public int getWieght(){};
    public int getHeight(){};
    public int getWidth(){};
    public int getLength(){};
    private setName(String new_name){
        name = new_name;
    }
    private setCategory(String new_category){
        category = new_category;
    }
}