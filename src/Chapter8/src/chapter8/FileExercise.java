//2082/01/11
//file write exercise
package chapter8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExercise {

    public static void main(String[] args) throws IOException {

        String path = ("C:\\Users\\DELL\\Documents\\RIYAZ MONSTER FILES\\RIYAZ JAVA(all)\\Chapter8\\file");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path + "\\bca.txt"))) {

            for (int i = 10; i <= 50; i++) {
                bw.write(i + "\n");
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }

        try (BufferedReader br = new BufferedReader(new FileReader(path + "\\bca.txt"))) {
            String c;
            while ((c = br.readLine()) != null) {
                if ((Integer.valueOf(c) % 2 == 0)) {
                    System.out.println(c);
                }
            }

        }

    }
}
