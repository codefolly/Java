//2082/01/12
//file 
package chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class FileConsole {
    public static void main(String[] args) throws IOException {
        String name;
        int age;
        /*
        // this is modern approach 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        name = sc.nextLine();
        System.out.println("Enter your age : ");
        age = sc.nextInt();
        System.out.println("Name is " + name +" and age is "+age);
*/
        // this is previous and old method and it is more faster and close to jvm code .
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter Your name : ");
            name = br.readLine();
            System.out.println("Enter your age : ");
            age = Integer.valueOf(br.readLine());
            
            System.out.println("The name is "+name +" and age is "+age);
        }
        catch(IOException ex){
            System.out.println(ex);
        }
        
    }
    
}
