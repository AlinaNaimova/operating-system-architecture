package Cars;

public class ElectricCar extends Car implements ElectricVehicle {
    private final double electricityConsumption;

    private static final String ELECTRIC_CAR_FIELD_TYPE = "electricity";
    private static final String ELECTRIC_CAR_TRANSMISSION_TYPE = "Electricity";



    public ElectricCar(String brand, String model, String color, String bodyType, int numberOfWheels, double electricityConsumption) {

        super(brand, model, color, bodyType, numberOfWheels, ELECTRIC_CAR_FIELD_TYPE, ELECTRIC_CAR_TRANSMISSION_TYPE, electricityConsumption);
        this.electricityConsumption = electricityConsumption;
    }

    @Override
    public void charge() {
        System.out.println(brand + " " + model + " is charging...");
    }
}
