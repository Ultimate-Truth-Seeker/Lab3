//package Lab3;

public class Snack extends Product {
    private float gr;
    private String flavor;
    private String stype;
    public Snack(int id, String name, int available, int sold, boolean status, float price, float gr, String flavor,
            String stype) {
        super(id, name, available, sold, status, price);
        this.gr = gr;
        this.flavor = flavor;
        this.stype = stype;
    }
    public float getGr() {
        return gr;
    }
    public String getFlavor() {
        return flavor;
    }
    public String getStype() {
        return stype;
    }
    
}
