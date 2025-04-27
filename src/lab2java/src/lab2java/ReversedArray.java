//lab 2 
// 2081/12/15
// reverse the array 

package lab2java;


public class ReversedArray {
    public static void main(String[] args) {
           int[] arr = {1,2,3,4,5};
           int i=0;
           int j=arr.length-1;
    int length = arr.length;
    while(i<j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
        System.out.println("The reversed array is : ");
    for(int k=0; k<arr.length ; k++){
        
        System.out.println( + arr[k]  );
    }
        
        }
        

    }
        

    

