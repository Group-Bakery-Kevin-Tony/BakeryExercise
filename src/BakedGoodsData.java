public class BakedGoodsData {


    private String name;
    private double price;
    private String date;
    private int quantity;
    private String dietaryRestriction;

    //default constructor
    public BakedGoodsData(){}

    //overloaded constructor
    public BakedGoodsData(String name, double price, String date, int quantity, String dietaryRestriction){
        this.name = name;
        this.price = price;
        this.date = date;
        this.quantity = quantity;
        this.dietaryRestriction = dietaryRestriction;
    }

        //getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDietaryRestriction() {
        return dietaryRestriction;
    }

        //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDietaryRestriction(String dietaryRestriction) {
        this.dietaryRestriction = dietaryRestriction;
    }

    public void displayGoods() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Date: " + date);
        System.out.println("Quantity: " + quantity);
    }
}
