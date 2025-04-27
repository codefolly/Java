//2081/12/
package chapter4;




class DisplayClass implements SampleInterface{

    public void display() {
        System.out.println("The definition of display:");
    }
}

public class MainInterface {

    public static void main(String[] args) {
        DisplayClass d = new DisplayClass();
        d.display();

    }

}
