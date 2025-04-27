//2081/11/26
// lab 2.1 change the main diagonal elements of a matix by user given number
package lab2java;

import java.util.Scanner;

public class DiagonalMain {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int[][] a = {{1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}};
        System.out.println("Original matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println("");
        }
        System.out.println("Enter 3 values to change :");
        
        for (int i = 0; i < 3; i++) {
            int temp = sc.nextInt();
            a[i][i] = temp;
        }
        System.out.println("changed matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println("");
        }
    }

}
