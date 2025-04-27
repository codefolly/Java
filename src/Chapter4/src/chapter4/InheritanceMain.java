//2081/11/27
// inheritance example of parent class and child class 
// super class and sub class 
//  extends is used to inheritance the character from the parent class
package chapter4;

import static java.awt.Color.red;

/*class Vehicle {

    int speed;

    void accelerate() {
        System.out.println("Accelerated : ");
    }
}

class Car extends Vehicle {

    void brake() {
        System.out.println("Break applied");
    }

}

public class InheritanceMain {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Car c1 = new Car();
        //v1.accelerate();
        c1.accelerate();
        //v1.brake();  parent class cannot use the quality of child class
        c1.brake();  // child class can inherit the properties of parents class 

    }

}
 */




//2081/11/27
//package chapter4;
//import static java.awt.Color.red;
// ANOTHER EXAMPLE OF JAVA INHERITANCE 
// use of super constructor
// with using gettter method to display in case of use of private variable in super class
class Vehicle {

    private int speed;
    private String color;

    Vehicle(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }
   

    void display() {
        System.out.println("Speed is : " + speed + ", Color is : " + color);
    }
     public String getColor() {
        return color;
    }
    public int getSpeed() {
        return speed;
    }
}

class Car extends Vehicle {

    Car(int speed, String color) {
        super(speed, color);
        //super.speed=speed;
        //super.color=color;
    }

    void drifted() {
        System.out.println("The car drifted at a speed of " + getSpeed() + " km/h in " + getColor() + " color.");
    }
}

public class InheritanceMain {

    public static void main(String[] args) {
        Car c1 = new Car(130, "red");
        c1.display();
        c1.drifted();

    }

}
