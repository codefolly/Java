// 2081/11/26
// lab 2.4 print given pattern 
package lab2java;

public class patternPrint {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");

            }
            for (int k = 0; k < 5 - i; k++) {
                System.out.print("1 ");

            }
                System.out.println("");
        }
    }
}

