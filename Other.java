//package Lab3;

import java.util.List;

public class Other extends Product {
    private String category;
    private List<String> fields;
    public Other(int id, String name, int available, int sold, boolean status, float price, String category,
            List<String> fields) {
        super(id, name, available, sold, status, price);
        this.category = category;
        this.fields = fields;
    }
    public String getCategory() {
        return category;
    }
    public List<String> getFields() {
        return fields;
    }
    
}
