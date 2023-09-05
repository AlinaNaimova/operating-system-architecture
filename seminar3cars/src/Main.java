import Cars.DieselCar;
import Cars.ElectricCar;
import Cars.GasolineCar;

public class Main {
    public static void main(String[] args) {
        GasolineCar gasolineCar = new GasolineCar("Nissan", "Murano", "silver", "crossover", 4, "automatic", 3.5);
        ElectricCar electricCar = new ElectricCar("Tesla", "S", "black", "5-door hatchback", 4, 20);
        DieselCar dieselCar = new DieselCar("Mitsubishi", "Pajero Sport", "white", "crossover", 4, "automatic", 3.2);
        ElectricCar electricCar1 = new ElectricCar("COMAC", "CS140", "white-grey", "sweeper", 4, 15);
        ElectricCar electricCar2 = new ElectricCar("Twike", "5", "brown", "three-wheeled two seater", 3, 36);

        gasolineCar.start();
        gasolineCar.stop();
        dieselCar.move();
        dieselCar.gearShift();
        electricCar1.sweepStreet();
        electricCar2.charge();

        electricCar.start();
        electricCar.stop();
    }

}