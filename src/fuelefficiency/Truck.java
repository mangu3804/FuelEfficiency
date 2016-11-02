package fuelefficiency;

/**
 *
 * @author mangu3804
 */
public class Truck extends Vehicle {
    
    /**
     * constructor
     */
    public Truck() {
        //super();
    }

    /**
     * Returns the truck distance.
     * pre: none
     * post: Distance has been returned.
     * @param litres
     * @return 
     */
    public double getDistance(double litres) {
        double distance = 100 / 14.1 * litres;
        return distance;
    }
}
