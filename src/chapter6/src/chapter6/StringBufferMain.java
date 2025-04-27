//2081/12/27
//string buffer 
//string buffer is advance version of string

package chapter6;


public class StringBufferMain {
    public static void main(String[] args) {
       //StringBuffer s = new StringBuffer("hsm");
       
        //System.out.println(s.capacity()); //here the default capacity of stringbuffer is 16 character not a 16 bytes
        
        StringBuffer s = new StringBuffer(5); // here the real capacity is less than the string so is create new space by using formula = (old capacity *2)+2
        s.append("hetauda");
        System.out.println(s.capacity());
    }
    
}
