package lesson3.home;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        int maxDecks = 5;
        String[] namesArray = new String[]{"Black pearl", "Argo", "Victory", "Disaster", "Flying Dutchman"};
        String[] countryArray = new String[]{"England","Spain","Netherlands"};
        Random random = new Random();

        Ship[] ships = new Ship[namesArray.length];
        for (int i = 0; i < namesArray.length; i++) {
            Ship ship = new Ship(random.nextDouble() * 1000, random.nextInt(maxDecks) + 1, random.nextDouble() * 10000, namesArray[i],countryArray[random.nextInt(countryArray.length)]);
            ships[i] = ship;
        }

        System.out.println("Массив после инициализации:");
        for (Ship ship : ships) {
            System.out.println(ship.toString());
        }

        Ship temp;
        for (int i = 0; i < ships.length; i++) {
            for (int j = ships.length - 1; j >= i + 1; j--) {
                if (ships[j].getMass() < ships[j - 1].getMass()) {
                    temp = ships[j];
                    ships[j] = ships[j - 1];
                    ships[j - 1] = temp;
                }
            }
        }

        System.out.println("Массив после сортировки по массе:");
        for (Ship ship : ships) {
            System.out.println(ship.toString());
        }

        String countryFilter = "England";
        int tempCounter = 0;
        System.out.println("Фильтр по стране: корабли, которые принедлежат флоту " + countryFilter);
        for (Ship ship : ships) {
            if (ship.getCountry().equals(countryFilter)){
                System.out.println(ship.toString());
                tempCounter++;
            }
        }
        if (tempCounter == 0){
            System.out.println("в массиве нет");
        }


    }
}
