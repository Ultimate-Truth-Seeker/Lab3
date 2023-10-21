//package Lab3;
/**
 * Clase para productos snack
 * 
 * @author Ultimate-Truth-Seeker
 * @version 21-10-2023
 */
public class Snack extends Product {
    private float gr;
    private String flavor;
    private String stype;
    /**
     * constructor
     * @param id
     * @param name
     * @param available
     * @param sold
     * @param status
     * @param price
     * @param gr
     * @param flavor
     * @param stype
     */
    public Snack(int id, String name, int available, int sold, boolean status, float price, float gr, String flavor,
            String stype) {
        super(id, name, available, sold, status, price);
        this.gr = gr;
        this.flavor = flavor;
        this.stype = stype;
    }
    /**
     * getter
     * @return gramos
     */
    public float getGr() {
        return gr;
    }
    /**
     * getter
     * @return sabor
     */
    public String getFlavor() {
        return flavor;
    }
    /**
     * getter
     * @return tamaño
     */
    public String getStype() {
        return stype;
    }
    
}
