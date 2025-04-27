
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javamagh15;
class factorial{
    public void f_function()
    {
        int fact = 1;
        for (int i = 1; i < 5; i++) {
            fact *= i;
        }
        System.out.println("the factorial is " + fact);
    }
}

public class Javamagh15 {

    public static void main(String[] args) {
        factorial f=new factorial();
        f.f_function();
       
    }

}
