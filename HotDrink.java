public class HotDrink extends Product{

    private Integer volume;
    private Integer temperature;

    public HotDrink(String kind, double price, Long id, Integer volume, Integer temperature) {
        super(kind, price, id);
        this.volume = volume;
        this.temperature = temperature;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getVolume() {
        return volume;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public String toString() {
        return String.format("Горячий напиток: %s (%sл., %s° C) - цена: %s", super.getKind(), this.volume, this.temperature, super.getPrice());
    }
}
