//package Lab3;

public abstract class Product {
    protected int id;
    protected String name;
    protected int available;
    protected int sold;
    protected boolean status;
    protected float price;
    public Product(int id, String name, int available, int sold, boolean status, float price) {
        this.id = id;
        this.name = name;
        this.available = available;
        this.sold = sold;
        this.status = status;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAvailable() {
        return available;
    }
    public int getSold() {
        return sold;
    }
    public boolean isStatus() {
        return status;
    }
    public float getPrice() {
        return price;
    }
    
}
