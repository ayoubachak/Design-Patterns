public class Main {
    public static void main(String[] args) {
        CarBuilder carBuilder = new FordCarBuilder();
        CarBuildDirector carBuildDirector = new CarBuildDirector(carBuilder);
        Car car = carBuildDirector.construct();

        System.out.println("Car make: " + car.getMake());
        System.out.println("Car transmission: " + car.getTransmission());
        System.out.println("Car number of doors: " + car.getNumberOfDoors());
    }
}
