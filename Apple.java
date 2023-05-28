public class Apple extends Product{

    public Apple(String kind, double price, Long id) {
        super(kind, price, id);
    }
    
    @Override
    public String toString() {
        return String.format("Яблоко: %s - цена: %s", super.getKind(), super.getPrice());
    }
}
