/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        Vending vending1 = new FruitVending();
        Vending vending2 = new HotDrinkVending();
        Product product1 = new Apple("Green Apple", 20, 1L);
        Product product2 = new Orange("Big Orange", 30, 2L);
        Product product3 = new Banana("African Banana", 25, 3L);
        Product product4 = new HotDrink("Cofe", 0, 4L, 1, 20);

        vending1.addProduct(product1);
        vending1.addProduct(product2);
        vending1.addProduct(product3);
        vending2.addProduct(product4);

        System.out.println(vending1.getProduct("Green Apple"));
        System.out.println(vending2.getProduct("Cofe"));
        System.out.println(vending2.getProduct("Cofe", 1, 20));
        System.out.println(vending1);

    }
}