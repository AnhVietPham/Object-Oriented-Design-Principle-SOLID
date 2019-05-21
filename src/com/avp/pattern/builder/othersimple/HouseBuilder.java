package com.avp.pattern.builder.othersimple;

class HouseBuilder {
    private House house;
    /**
     * Mandatory bond properties
     */
    HouseBuilder(int window, int door, int room) {
        house = new House(window, door, room);
    }
    /**
     * Optional bond properties
     */
    HouseBuilder withGarage(boolean isGarage) {
        house.setGarage(isGarage);
        return this;
    }

    HouseBuilder withGarden(boolean isGarden) {
        house.setGarden(isGarden);
        return this;
    }

    HouseBuilder withSwimmingPool(boolean isSwimmingPool) {
        house.setSwimPool(isSwimmingPool);
        return this;
    }

    House build() {
        return house;
    }

}
