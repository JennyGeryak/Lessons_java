public class CustomerGoods {
    public String name;
    public String category;
    public int wieght;
    public int height;
    public int width;
    public int length;
    public long date_of_manufacture;
    public long shelf_life;
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
    public setName(String new_name){
        name = new_name;
    }
    public setCategory(String new_category){
        category = new_category;
    }
}