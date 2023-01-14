public class Car {
    private String make;
    private String transmission;
    private int numberOfDoors;
    public void setMake(String make) {
        this.make = make;
    }
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    public String getMake() {
        return make;
    }
    public String getTransmission() {
        return transmission;
    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}