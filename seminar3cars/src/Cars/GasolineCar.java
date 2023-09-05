package Cars;

public class GasolineCar extends Car implements GasStation {
    private static final String GASOLINE_CAR_FUEL_TYPE = "Gasoline";

    public GasolineCar(String brand, String model, String color, String bodyType, int numberOfWheels, String transmissionType, double engineVolume) {
        super(brand, model, color, bodyType, numberOfWheels, GASOLINE_CAR_FUEL_TYPE, transmissionType, engineVolume);
    }

    @Override
    public void refuel(String fuelType) {
        if (fuelType.equals("Gasoline")) {
            System.out.println("Refueling with gasoline");
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
