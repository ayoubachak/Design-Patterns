public class FordCarBuilder implements CarBuilder {
    private Car car;
    public FordCarBuilder() {
        car = new Car();
    }
    public void setMake() {
        car.setMake("Ford");
    }
    public void setTransmission() {
        car.setTransmission("Automatic");
    }
    public void setNumberOfDoors() {
        car.setNumberOfDoors(4);
    }
    public Car getCar() {
        return car;
    }
}