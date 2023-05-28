package Semenar_OOP1;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        Vending vending1 = new FructVending();
        Product product1 = new Apple("Apple", 20, 1L);
        Product product2 = new Orange("Orange", 30, 2L);
        Product product3 = new Banana("Banana", 25, 3L);
        System.out.println(vending1.getProduct("Apple"));

    }
}