package fuelefficiency;

/**
 *
 * @author mangu3804
 */
public class HybridCar extends Vehicle {
    
    /**
     * constructor
     */
    public HybridCar() {
        //super();
    }

    /**
     * Returns the hybrid car distance.
     * pre: none
     * post: Distance has been returned.
     * @param litres
     * @return 
     */
    public double getDistance(double litres) {
        double distance = 100 / 3.8 * litres;
        return distance;
    }
}
