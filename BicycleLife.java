class BicycleLife {
    int cadence = 0;
    int speed = 0;
    int gear = 0;

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void speedUp(int increment) {
        speed += increment;
    }

    void applyBreak(int decrement) {
        speed -= decrement;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void printStates() {
        System.out.println("скорость вращения: " + cadence + ", скорость: " + speed + ", передача: " + gear);
    }
}