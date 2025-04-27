/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PrimeNumber {
    public static void main(String[] args) {
        
        
        int n; 
        int flag=0;
        int i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter the Value of n:");
        
        
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
               flag =1;  // signal for not prime
               
              break;
            }
        }
        if(n%i==2)//if(flag==0 & num.2)
        {
            System.out.println("This is prime");
        }
        else
        {
            System.out.println("this is not prime");
        }
    }
}
