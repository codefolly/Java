//2081/12/27
//sorting the name of the colors into ascending orders.
//bubble sort for sorting in ascending order

package chapter6;

import java.util.Scanner;

public class StringSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] color = new String[5];
        System.out.println("Enter 5 different Colors : ");

        //for the input
        for (int i = 0; i < 5; i++) {
            color[i] = sc.next();
        }

        //for sorting 
        for (int i = 0; i < 5 - 1; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                if (color[j].compareTo(color[j + 1]) > 0) {
                    String t = color[j];
                    color[j] = color[j + 1];
                    color[j + 1] = t;

                }
            }
        }
        
        //for displaying 
        System.out.println("Sorted colors in acsending order ");
        for (int i = 0; i < 5; i++) {
            System.out.println(color[i]);
        }

    }

}
