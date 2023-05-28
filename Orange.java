public class Orange extends Product{

    public Orange(String name, double price, Long id) {
        super(name, price, id);
    }
    
    @Override
    public String toString() {
        return String.format("Апельсин: %s - цена: %s", super.getKind(), super.getPrice());
    }
}
