//2082/01/11
package chapter8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SringCheck {

    public static void main(String[] args) throws IOException {
        String path = ("C:\\Users\\DELL\\Documents\\RIYAZ MONSTER FILES\\RIYAZ JAVA(all)\\Chapter8\\file");
        Scanner sc = new Scanner(System.in);
        String word = "";
        System.out.println("Enter a string : ");
        word = sc.nextLine();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path + "\\abc.txt"))) {
            for(String red : word.split(" ")){
                if(red.startsWith("t")){
                bw.write(red+ " ");
                
            }

        }
        }
        catch(IOException ex){
            System.out.println(ex);
        }
        try (BufferedReader br = new BufferedReader(new FileReader(path + "\\abc.txt"))) {
            String c;
            while((c = br.readLine())!=null){
                System.out.println(c);
            }

    }
}
}
