package chapter4;

class Fruit {

    String name;
    String taste;
    int size;

    Fruit(String name, String taste, int size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        
        System.out.println("The name of fruit is : " + name + " and taste is : " + taste + " and size is : " + size);
    }
}

class Apple extends Fruit {

    Apple(String name, String taste, int size) {
        super(name, taste, size);
    }

    void eat() {
        System.out.println("The name of fruit is : " + name + " and taste is : sweet and size is : " + size);
    }
}

class Orange extends Fruit {

    Orange(String name, String taste, int size) {
        super(name, taste, size);
    }

    void eat() {
        //super.eat();
        System.out.println("The name of fruit is : " + name + " and taste is : sour  and size is : " + size);
       // super.eat();
    }
}

public class FruitMain {

    public static void main(String[] args) {
        Apple a1 = new Apple("Apple","sweet",20);

        Orange o1 = new Orange("Orange","sour",23);

        a1.eat();
        o1.eat();
    }
}
