/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopchapter3;

// method overloading and varargs
// 2081/11/25
class Varx {

    int add(int... a) {
        return 1;
    }

    double add(boolean... b) {
        return 0;
    }
}

public class AmbigiousInvocation {

    public static void main(String[] args) {
        Varx h1 = new Varx();
        h1.add(2, 4);
        h1.add(true, false);
        System.out.println(h1.add(2, 3));
    }
}
