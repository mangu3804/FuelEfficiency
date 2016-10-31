package fuelefficiency;

/**
 *
 * @author mangu3804
 */
public class FuelEfficiency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle truck = new Truck();
        Vehicle car = new Car();
        Vehicle hybridCar = new HybridCar();
        Vehicle motorcycle = new Motorcycle();

        System.out.println("On 50L of gas, the vehicles can drive: \n"
                + "\nTruck: " + truck.getDistance(50) + "km"
                + "\nCar: " + car.getDistance(50) + "km"
                + "\nHybrid Car: " + hybridCar.getDistance(50) + "km"
                + "\nMotorcycle: " + motorcycle.getDistance(50) + "km");
    }

}
