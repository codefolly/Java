// 2081/12/27 
//reverse the string using stringbuffer
//buffer ma replace garda same location mai store hunxa because these is mutable 
package chapter6;

import java.util.Scanner;


public class StringReverseMain {
    public static void main(String[] args) {
        StringBuffer[] color = {new StringBuffer("red"),new StringBuffer("green")};
        
        for(StringBuffer i: color){
            System.out.println(i.reverse());
        }
        
    }
    
}
