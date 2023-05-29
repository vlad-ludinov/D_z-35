public class HotDrink extends Product{

    private Double volume;
    private Integer temperature;
    private Integer sugar = null;

    public HotDrink(String kind, double price, Long id, Double volume, Integer temperature) {
        super(kind, price, id);
        this.volume = volume;
        this.temperature = temperature;
    }

    public HotDrink(String kind, double price, Long id, Double volume, Integer temperature, Integer sugar) {
        super(kind, price, id);
        this.volume = volume;
        this.temperature = temperature;
        this.sugar = sugar;
    }


    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public void setSugar(Integer sugar) {
        this.sugar = sugar;
    }

    public Double getVolume() {
        return volume;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public Integer getSugar() {
        return sugar;
    }

    public String toString() {
        if (sugar == null) {
            return String.format("Горячий напиток: %s (%s л., %s° C) - цена: %s", super.getKind(), this.volume, this.temperature, super.getPrice());
        } else {
            return String.format("Горячий напиток: %s (%s л., %s° C, %s куб. схp.) - цена: %s", super.getKind(), this.volume, this.temperature, this.sugar ,super.getPrice());
        }
    }
}
