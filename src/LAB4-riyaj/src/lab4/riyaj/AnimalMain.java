//2081/12/22
//inheritance question 
//lab 4.1

package lab4.riyaj;

 class Animal {

    String name;
    int age;

     Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void eat() {
        System.out.println("The animal " + name+ " eats");

    }

    void sleep() {
        System.out.println("The animal " + name + " sleep");

    }
}
class Dog extends Animal{
     
    Dog( String name,int age){
        super(name,age);
    }
    void eat(){
        System.out.println("The dog "+name + " eats.");
        super.eat();
    }
}
class Cat extends Animal{
    
    Cat( String name,int age){
        super(name,age);
    }
    void eat(){
        System.out.println("The cat "+name + " eats.");
        //super.eat();
    }
}
    

public class AnimalMain {

    public static void main(String[] args) {
        Animal a; // this is reference variable of superclass .
        Dog d = new Dog("jack",12);
        Cat c = new Cat("marry",12);
        d.eat();
        d.sleep();
        c.eat();
        c.sleep();

    }

}
