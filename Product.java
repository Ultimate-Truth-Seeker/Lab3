//package Lab3;
/**
 * Superclase para productos
 * 
 * @author Ultimate-Truth-Seeker
 * @version 21-10-2023
 */
public abstract class Product {
    protected int id;
    protected String name;
    protected int available;
    protected int sold;
    protected boolean status;
    protected float price;
    /**
     * constructor
     * @param id
     * @param name
     * @param available
     * @param sold
     * @param status
     * @param price
     */
    public Product(int id, String name, int available, int sold, boolean status, float price) {
        this.id = id;
        this.name = name;
        this.available = available;
        this.sold = sold;
        this.status = status;
        this.price = price;
    }
    /**
     * getter
     * @return id
     */
    public int getId() {
        return id;
    }
    /**
     * getter
     * @return nombre
     */
    public String getName() {
        return name;
    }
    /**
     * getter
     * @return disponibles
     */
    public int getAvailable() {
        return available;
    }
    /**
     * getter
     * @return vendidos
     */
    public int getSold() {
        return sold;
    }
    /**
     * getter
     * @return estado
     */
    public boolean isStatus() {
        return status;
    }
    /**
     * getter
     * @return precio
     */
    public float getPrice() {
        return price;
    }
    
}
