public class Banana extends Product{

    public Banana(String name, double price, Long id) {
        super(name, price, id);
    }
    
    @Override
    public String toString() {
        return String.format("Банан: %s - цена: %s", super.getKind(), super.getPrice());
    }
}
