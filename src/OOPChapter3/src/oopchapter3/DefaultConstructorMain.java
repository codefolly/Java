/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopchapter3;



class Machine{  // default constructor is hidden
  double weight ;
  string name;
  
  void display(){
      System.out.println("");
  }
}
public class DefaultConstructorMain {
    public static void main(String[] args) {
        Machine m= new Machine();
        m.display();
        m.weight=12.5;
       
    }
    
}
