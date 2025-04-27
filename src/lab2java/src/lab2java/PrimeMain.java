//2081/12/15
// prime check of given range 
// lab question 


package lab2java;

import java.util.Scanner;

public class PrimeMain {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("enter starting range:");
        int a=s.nextInt();
        
        System.out.println("enter ending Range:");
        int b=s.nextInt();
        
        for(int i=a;i<b;i++)
        {
            int flag=1;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1){
            System.out.println(i);
            }
        }
        
    }
}