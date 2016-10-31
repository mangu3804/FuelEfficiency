package fuelefficiency;

/**
 *
 * @author mangu3804
 */
public abstract class Vehicle {
    private double fuelEfficiency;
    
    /**
     * Instantiates a vehicle with a fuelEfficiency of fuelEff
     * pre: none
     * post : Vehicle object with fuelEfficiency created.
     * @param fuelEff 
     */
    public Vehicle(double fuelEff) {
        fuelEfficiency = fuelEff;
    }
    
    /**
     * Calculates the distance given the amount of litres
     * pre: none
     * post: Distance is returned.
     * @param litres
     * @return 
     */
    public double getDistance(double litres) {
        double distance = 100 / fuelEfficiency * litres;
        return distance;
    }
}
