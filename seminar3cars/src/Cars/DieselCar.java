package Cars;

public class DieselCar extends Car implements GasStation {
    private static final String DIESEL_CAR_FUEL_TYPE = "diesel";

    public DieselCar(String brand, String model, String color, String bodyType, int numberOfWheels, String transmissionType, double engineVolume) {
        super(brand, model, color, bodyType, numberOfWheels, DIESEL_CAR_FUEL_TYPE, transmissionType, engineVolume);
    }

    @Override
    public void refuel(String fuelType) {
        if (fuelType.equals("Diesel")) {
            System.out.println("Refueling with diesel");
        } else {
            System.out.println("Wrong fuel type");
        }
    }

    @Override
    public void cleanWindshield() {

    }

    @Override
    public void cleanHeadlights() {

    }

    @Override
    public void cleanMirrors() {

    }
}


