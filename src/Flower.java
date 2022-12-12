public class Flower {

    private final String flowerName;
    private String country;
    private final double cost;
    private int lifeSpan;

    public Flower(String flowerName, String country, double cost) {
        if (flowerName == null || flowerName.isEmpty()) {
            this.flowerName = "тип цветка не указан";
        } else {
            this.flowerName = flowerName;
        }
        if (country == null || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        this.lifeSpan = 3;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;

        }
    }

    public  Flower(String flowerName, String country, double cost, int lifeSpan) {
        this.flowerName = flowerName;
        this.country = country;
        this.cost = cost;
        this.lifeSpan = lifeSpan;
    }
    @Override
    public String toString() {
        return ("Название цветка: " + flowerName + ", страна: " + country +
                ", стоимость за штуку: " + cost + " руб., срок стояния цветка: " + lifeSpan +
                " дн.");
    }
}
