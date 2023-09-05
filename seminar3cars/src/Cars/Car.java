package Cars;

public abstract class Car {
    public String brand;
    public String model;
    private String color;
    private String bodyType;
    private int numberOfWheels;
    private String fuelType;
    private String transmissionType;
    private double engineVolume;

    public Car(String brand, String model, String color, String bodyType, int numberOfWheels, String fuelType, String transmissionType, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.numberOfWheels = numberOfWheels;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.engineVolume = engineVolume;
    }

    public void move() {
        System.out.println("The " + brand + " " + model + " is moving.");
    }

    public void service() {
        System.out.println("The " + brand + " " + model + " is being serviced.");
    }

    public void gearShift() {
        System.out.println("The " + brand + "'s" + " gear has been shifted.");
    }

    public void turnOnLights() {
        System.out.println("The " + brand + "'s" + " lights have been turned on.");
    }

    public void turnOnWipers() {
        System.out.println("The " + brand + "'s" + " wipers have been turned on.");
    }

    public void sweepStreet() {
        System.out.println("The " + brand + " " + model + " is sweeping the street.");
    }

    public void turnOnFogLights() {
        System.out.println("The " + brand + "'s" + " fog lights have been turned on.");
    }

    public void transportCargo() {
        System.out.println("The " + brand + " " + model + " is transporting cargo.");
    }

    public void start() {
        System.out.println("The " + brand + " " + model + " is started");
    }

    public void stop() {
        System.out.println("The " + brand + " " + model + " is stopped");
    }
}