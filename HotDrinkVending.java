import java.util.ArrayList;
import java.util.List;






public class HotDrinkVending implements Vending{

    private final List<HotDrink> hotDrinkList;

    public HotDrinkVending() {
        hotDrinkList = new ArrayList<>();
    }

    public void addProduct(HotDrink product) {
        hotDrinkList.add(product);
    }

    
    public HotDrink getProduct(String kind, Integer volume, Integer temperature) {
        for (HotDrink product : hotDrinkList) {
            if (kind.equals(product.getKind()) && volume.equals(product.getVolume()) && temperature.equals(product.getTemperature())) {
                return product;
            }
        }
        return null;
    }
    
}
