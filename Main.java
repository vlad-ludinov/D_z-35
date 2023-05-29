/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        Vending vending1 = new FruitVending();
        HotDrinkVending vending2 = new HotDrinkVending();

        Product product1 = new Apple("Green Apple", 20, 1L);
        Product product2 = new Orange("Big Orange", 30, 2L);
        Product product3 = new Banana("African Banana", 25, 3L);

        HotDrink product4 = new HotDrink("Cappuchino", 100, 1L, 0.75, 20);
        HotDrink product5 = new HotDrink("Hot Chocolate", 70, 2L, 0.5, 20, 3);
        HotDrink product6 = new HotDrink("Milk", 40, 3L, 1D, 10);

        vending1.addProduct(product1);
        vending1.addProduct(product2);
        vending1.addProduct(product3);
        vending2.addProduct(product4);
        vending2.addProduct(product5);
        vending2.addProduct(product6);


        System.out.println(vending1.getProduct("Green Apple"));        
        System.out.println(vending2.getProduct("Milk", 1D, 10));
        System.out.println(vending2.getProduct("Hot Chocolate", 0.5, 20));
        System.out.println();
        System.out.println(vending1);
        System.out.println(vending2);

    }
}