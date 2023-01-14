class CarBuildDirector {
    private CarBuilder carBuilder;
    public CarBuildDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }
    public Car construct() {
        carBuilder.setMake();
        carBuilder.setTransmission();
        carBuilder.setNumberOfDoors();
        return carBuilder.getCar();
    }
}
