package Semenar_OOP1;

import java.util.ArrayList;
import java.util.List;

/**
 * Vending
 */
public abstract class Vending {

    private List<Product> list_product = new ArrayList<>();

    public void addProduct(Product product) {
        list_product.add(product);
    }

    public Product getProduct(String name) {
        for (Product product : list_product) {
            if (name.equals(product.getKind())) {
                return product;
            }
        }
        return null;
    }

    
}