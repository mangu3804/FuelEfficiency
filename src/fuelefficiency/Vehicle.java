package fuelefficiency;

/**
 *
 * @author mangu3804
 */
public abstract class Vehicle {
    
    /**
     * constructor
     */
    public Vehicle() {
        //super();
    }
    
    /**
     * Returns the distance.
     * pre: none
     * post: Distance has been returned.
     * @param litres
     * @return 
     */
    public abstract double getDistance(double litres);
    
}
