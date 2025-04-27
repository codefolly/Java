//2082/01/03
//lab 6.2 string search
package lab6.riyaj;

import java.util.Scanner;

public class StringSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        String[] words = new String[5];
        System.out.println("Enter 5 different word : ");
        
        for (int i = 0; i < 5; i++) {
            words[i] = sc.next();
        }
         */
        System.out.println("Enter the sentence : ");
        String sentence = sc.nextLine();
        int count = 0;
        boolean flag = false;
        for (String word : sentence.split(" ")) {

            for (int i = 0; i < word.length() - 1; i++) {
                if (word.regionMatches(true, i, "sh", 0, 2)) {
                    System.out.println("the word with sh is : " + word);
                    flag = true;
                    count++;
                    break;
                }
            }

        }
        System.out.println("total count is : " + count);
        if (!flag) {
            System.out.println("not found ");

        }

        // System.out.println(r.regionMatches(false, 1, t, 1,2));
    }

}
