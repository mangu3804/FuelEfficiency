package fuelefficiency;

/**
 *
 * @author mangu3804
 */
public class Car extends Vehicle {
    
    /**
     * constructor
     */
    public Car() {
        //super();
    }

    /**
     * Returns the car distance.
     * pre: none
     * post: Distance has been returned.
     * @param litres
     * @return 
     */
    public double getDistance(double litres) {
        double distance = 100 / 9.4* litres;
        return distance;
    }
}
