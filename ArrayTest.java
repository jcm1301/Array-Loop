//import java.util.Scanner; 
import java.util.Arrays; 

public class ArrayTest {
    
    public static void main(String[] args){
 
        int x = 20; 
        int y = 267; 
        
        String names[] = {"Bill", "Tom", "Molly"};
        int numbers[] = {5,10,15,20};
        
        Array myArray = new Array(x,names,numbers);

        System.out.println("\n" + myArray.getX(x) + "\n"); 
        System.out.println(myArray.getY(y) + "\n");

        System.out.println(Arrays.toString(names));
        System.out.println(myArray.getNames(names) + "\n");

        System.out.println(Arrays.toString(numbers));
        System.out.println(myArray.getNums(numbers) + "\n");

        myArray.setX(10);

        
        //loop that iterates through names and numbers
        myArray.printLoop(); 
       
        System.out.println(""); 

        //print object
        System.out.println(myArray + "\n");   

        /*Scanner input = new Scanner(System.in);

        System.out.println(myArray.getX); 
        myArray.setX;
        myArray.select(); */

    }

}
