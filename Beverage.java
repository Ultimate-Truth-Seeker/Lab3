package Lab3;

public class Beverage extends Product {
    private float ml;
    private String btype;
    public Beverage(int id, String name, int available, int sold, boolean status, float price, float ml, String btype) {
        super(id, name, available, sold, status, price);
        this.ml = ml;
        this.btype = btype;
    }
    public float getMl() {
        return ml;
    }
    public String getBtype() {
        return btype;
    }
        
}
