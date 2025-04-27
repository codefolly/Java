//2082/01/03
// adding the element of array with last element 1 like 41,31 etc. 
package lab6.riyaj;

import java.util.Scanner;


public class Task {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[5]; 
        int sum=0;
        System.out.println("Enter five numbers: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            if(arr[i]%10==1 ){
                sum+=arr[i];
            }
        }
        System.out.println(+sum);
        
         //System.out.println(s.endsWith("le "));
         
    }
    
}
