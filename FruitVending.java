import java.util.ArrayList;
import java.util.List;

public class FruitVending implements Vending{

    private final List<Product> fruitList;

    public FruitVending() {
        fruitList = new ArrayList<>();
    }

    @Override
    public void addProduct(Product product) {
        fruitList.add(product);
    }

    @Override
    public Product getProduct(String kind) {
        for (Product product : fruitList) {
            if (kind.equals(product.getKind())) {
                return product;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String res = "";
        for (Product product : fruitList) {
            res += String.format("%s: %s - цена: %s\n", product.getId(), product.getKind(), product.getPrice());
        }
        return res;
    }

}
