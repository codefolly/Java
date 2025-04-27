/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
// this is the initilization of object using reference variable
class Rectangle{
     double length, breadth; // this is instance variable
    /*void area(){                          // without calling function no return type
        System.out.println("The area is "+ length * breadth);
    }*/
    double area(){
        return length * breadth;
    }
}
public class ShapeNew {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(); // initilize object using reference variable
        Rectangle r2 = new Rectangle();
        
        r1.length = 3.778;
        r1. breadth = 5;
        
        r2.length = 5;
        r2.breadth= 8;
        /*
        r1.area();
        r2.area();
        */
        System.out.println("The area is "+r1.area());
        System.out.println("The area is "+r2.area());
        
    }
    
}
