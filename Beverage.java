//package Lab3;
/**
 * Clase para productos tipo bebida
 * 
 * @author Ultimate-Truth-Seeker
 * @version 21-10-2023
 */
public class Beverage extends Product {
    private float ml;
    private String btype;
    /**
     * constructor
     * @param id
     * @param name
     * @param available
     * @param sold
     * @param status
     * @param price
     * @param ml
     * @param btype
     */
    public Beverage(int id, String name, int available, int sold, boolean status, float price, float ml, String btype) {
        super(id, name, available, sold, status, price);
        this.ml = ml;
        this.btype = btype;
    }
    /**
     * getter
     * @return mililitros
     */
    public float getMl() {
        return ml;
    }
    /**
     * getter
     * @return tipo
     */
    public String getBtype() {
        return btype;
    }
        
}
