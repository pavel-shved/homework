package lesson3.home;

import java.util.Objects;

public class Ship {
    private double weight;
    private int deck;
    private double price;
    private String name;
    private String releaseDate;

    public Ship(){}

    public Ship(double weight, int deck, double price, String name, String releaseDate) {
        this.weight = weight;
        this.deck = deck;
        this.price = price;
        this.name = name;
        this.releaseDate = releaseDate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getDeck() {
        return deck;
    }

    public void setDeck(int deck) {
        this.deck = deck;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return Double.compare(ship.weight, weight) == 0 &&
                deck == ship.deck &&
                Double.compare(ship.price, price) == 0 &&
                Objects.equals(name, ship.name) &&
                Objects.equals(releaseDate, ship.releaseDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, deck, price, name, releaseDate);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "weight=" + weight +
                ", deck=" + deck +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
