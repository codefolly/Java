/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;

import java.util.Scanner;


public class Lab1 {

  
    public static void main(String[] args) {
        
        
          Scanner sc=new Scanner(System.in);
          int n;  
        System.out.println("Enter the number of term :  ");
        n=sc.nextInt();
        int sum_e=0;
        int sum_o =0;
        for(int i=1;i<=n;i++)
        {
            sum_e = sum_e + (i*2);
            sum_o = sum_o + (i*2-1);
        }
        System.out.println("The sum of Even is "+sum_e);
        System.out.println("The sum of odd is "+ sum_o);
    }
    
}
