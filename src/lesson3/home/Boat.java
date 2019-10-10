package lesson3.home;

import lesson4.home.ShipTypes;

import java.util.Objects;

public class Boat extends Ship {
    private int passengers;
    public static int countBoat;

    static {
        countBoat = 0;
    }

    public Boat(){
        super();
        countBoat++;
    }

    public Boat(int passengers) {
        this.passengers = passengers;
        countBoat++;
    }

    public Boat(double mass, int decks, double price, String name, String country, boolean isIncapable, ShipTypes shipTypes, int passengers) {
        super(mass, decks, price, name, country, isIncapable, ShipTypes.FISHING);
        this.passengers = passengers;
        countBoat++;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Boat boat = (Boat) o;
        return passengers == boat.passengers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengers);
    }

    @Override
    public String toString() {
        return super.toString() +
                " <--- Boat{" +
                "passengers=" + passengers +
                '}';
    }
}
