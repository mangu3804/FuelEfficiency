package fuelefficiency;

/**
 *
 * @author mangu3804
 */
public class Motorcycle extends Vehicle {
    
    /**
     * constructor
     */
    public Motorcycle() {
        //super();
    }

    /**
     * Returns the motorcycle distance.
     * pre: none
     * post: Distance has been returned.
     * @param litres
     * @return 
     */
    public double getDistance(double litres) {
        double distance = 100 / 6.3 * litres;
        return distance;
    }
}
