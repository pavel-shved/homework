package lesson3.home;

import lesson4.home.ShipFunctionality;
import lesson4.home.ShipTypes;
import lesson4.home.Transport;
import lesson4.home.TransportFunctionality;

import java.util.Objects;

public class Ship extends Transport implements TransportFunctionality, ShipFunctionality {
    private double mass;
    private int decks;
    private double price;
    private String name;
    private String country;
    private boolean isIncapable;
    private ShipTypes type;


    public Ship() {
    }


    public Ship(double mass, int decks, double price, String name, String country, boolean isIncapable, ShipTypes type) {
        this.mass = mass;
        this.decks = decks;
        this.price = price;
        this.name = name;
        this.country = country;
        this.isIncapable = isIncapable;
        this.type = type;
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

    public ShipTypes getType() {
        return type;
    }

    public void setType(ShipTypes type) {
        this.type = type;
    }

    public boolean isIncapable() {
        return isIncapable;
    }

    public void setIncapable(boolean incapable) {
        isIncapable = incapable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return Double.compare(ship.mass, mass) == 0 &&
                decks == ship.decks &&
                Double.compare(ship.price, price) == 0 &&
                isIncapable == ship.isIncapable &&
                Objects.equals(name, ship.name) &&
                Objects.equals(country, ship.country) &&
                type == ship.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mass, decks, price, name, country, isIncapable, type);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "mass=" + mass +
                ", decks=" + decks +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", isIncapable=" + isIncapable +
                ", type=" + type +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Sail sail sail");
    }

    @Override
    public void upgrade() {
        System.out.println("Ship id Upgraded");
    }

    @Override
    public void utilize() {
        if (!isIncapable()){
            System.out.println("Ship is dead");
        }
    }
}
