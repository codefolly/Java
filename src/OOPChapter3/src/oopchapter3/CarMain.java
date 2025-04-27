// 2081/11/26
// getter and setter methods 
// get - for display value
// set - to give input
package oopchapter3;
/*
class Car {

    private double distance, time;

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getDistance() {
        return distance;
    }

    public double getTime() {
        return time;
    }

    void calculateSpeed() {
        System.out.println("Speed is : " + distance / time);
    }
}

public class CarMain {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setDistance(12.5);
        c1.setTime(45.8);
        System.out.println("Distance is : " + c1.getDistance());
        System.out.println("Time is : " + c1.getTime());
        c1.calculateSpeed();
    }

}
*/


// using constructor method  in case of private variable
// without setter method
class Car {

    private double distance, time;

    // Constructor to initialize fields
    public Car(double distance, double time) {
        this.distance = distance;
        this.time = time;
    }

    public double getDistance() {
        return distance;
    }

    public double getTime() {
        return time;
    }

    void calculateSpeed() {
        System.out.println("Speed is : " + distance / time);
    }
}

public class CarMain {

    public static void main(String[] args) {
        // Create a Car object with distance and time values
        Car c1 = new Car(12.5, 45.8);
        System.out.println("Distance is : " + c1.getDistance());
        System.out.println("Time is : " + c1.getTime());
        c1.calculateSpeed();
    }
}
