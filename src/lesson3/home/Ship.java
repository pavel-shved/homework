package lesson3.home;

import java.util.Objects;

public class Ship {
    private double mass;
    private int decks;
    private double price;
    private String name;
    private String country;

    public Ship() {
    }


    public Ship(double mass, int decks, double price, String name, String releaseDate) {
        this.mass = mass;
        this.decks = decks;
        this.price = price;
        this.name = name;
        this.country = releaseDate;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getDecks() {
        return decks;
    }

    public void setDecks(int decks) {
        this.decks = decks;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return Double.compare(ship.mass, mass) == 0 &&
                decks == ship.decks &&
                Double.compare(ship.price, price) == 0 &&
                Objects.equals(name, ship.name) &&
                Objects.equals(country, ship.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mass, decks, price, name, country);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "mass=" + mass +
                ", decks=" + decks +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
