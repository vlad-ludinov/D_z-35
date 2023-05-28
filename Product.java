package Semenar_OOP1;

public abstract class Product {
    
    private String kind;
    private double price;
    private Long id;


    public Product(String kind, double price, Long id) {
        this.kind = kind;
        this.price = price;
        this.id = id;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKind() {
        return kind;
    }

    public double getPrice() {
        return price;
    }

    public Long getId() {
        return id;
    }
}
