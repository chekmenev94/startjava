class BycicleDemo {
    public static void main(String[] args) {
    BicycleLife bike1 = new BicycleLife();
    BicycleLife bike2 = new BicycleLife();

    bike1.changeCadence(50);
    bike1.speedUp(10);
    bike1.changeGear(2);
    bike1.speedUp(10);
    bike1.changeGear(3);
    bike1.printStates();
    }
}