package com.avp.pattern.builder.othersimple;

public class Program {
    public static void main(String args[]) {
        /**
         * House simple
         * */
        House house = new HouseBuilder(4, 4, 4)
                .build();
        /**
         * House with garage
         * */
        House houseWithGarage = new HouseBuilder(4, 4, 4)
                .withGarage(true)
                .build();
        /**
         * House with swimming pool
         * */
        House houseWithSwimming = new HouseBuilder(4, 4, 4)
                .withSwimmingPool(true)
                .build();
        /**
         * Big House
         * */
        House bigHouse = new HouseBuilder(4, 4, 4)
                .withSwimmingPool(true)
                .withGarage(true)
                .withGarden(true)
                .build();

        System.out.println(house);
        System.out.println(houseWithGarage);
        System.out.println(houseWithSwimming);
        System.out.println(bigHouse);
    }
}
