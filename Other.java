//package Lab3;

import java.util.List;
/**
 * Clase para categorías diferentes
 * 
 * @author Ultimate-Truth-Seeker
 * @version 21-10-2023
 */
public class Other extends Product {
    private String category;
    private List<String> fields;
    /**
     * Constructor de la clase
     * @param id
     * @param name
     * @param available
     * @param sold
     * @param status
     * @param price
     * @param category
     * @param fields
     */
    public Other(int id, String name, int available, int sold, boolean status, float price, String category,
            List<String> fields) {
        super(id, name, available, sold, status, price);
        this.category = category;
        this.fields = fields;
    }
    /**
     * getter
     * @return categoría
     */
    public String getCategory() {
        return category;
    }
    /**
     * getter
     * @return campos
     */
    public List<String> getFields() {
        return fields;
    }
    
}
