package lesson3.home;

import lesson4.home.ShipTypes;

import java.util.Random;

public class DemoBoat {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Количество лодок = " + Boat.countBoat);

        Boat[] boats = new Boat[5];
        for (int i = 0; i < boats.length; i++) {
            if (i < 1) {
                boats[i] = new Boat(random.nextDouble() * 1000, random.nextInt(10) + 1, random.nextDouble() * 10000, "Victory","England",false, ShipTypes.FISHING,random.nextInt(100));
            } else if (i < 3) {
                boats[i] = new Boat(random.nextInt(100));
            } else {
                boats[i] = new Boat();
            }
        }

        System.out.println("Массив лодок: ");
        for (Boat boat : boats) {
            System.out.println(boat.toString());
        }
        System.out.println("Количество лодок = " + Boat.countBoat);

    }
}
