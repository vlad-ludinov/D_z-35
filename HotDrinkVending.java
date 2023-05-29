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

    
    public HotDrink getProduct(String kind, Double volume, Integer temperature) {
        for (HotDrink product : hotDrinkList) {
            if (kind.equals(product.getKind()) && volume.equals(product.getVolume()) && temperature.equals(product.getTemperature())) {
                return product;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String res = "";
        for (HotDrink product : hotDrinkList) {
            if (product.getSugar() == null) {
                res += String.format("%s: %s (%s л., %s° C) - цена: %s\n", product.getId(), product.getKind(), product.getVolume(), product.getTemperature(), product.getPrice());
            } else {
                res += String.format("%s: %s (%s л., %s° C, %s куб. схp.) - цена: %s\n", product.getId(), product.getKind(), product.getVolume(), product.getTemperature(), product.getSugar(), product.getPrice());
            }
        }
        return res;
    }

    @Override
    public void addProduct(Product product) {
    }

    @Override
    public Product getProduct(String kind) {
        return null;
    }
    
}
