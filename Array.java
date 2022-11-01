//import java.util.Scanner; 
import java.util.Arrays; 

public class Array{

    private int x;
    private int y; 
    

    private String[] names  = new String[10];
    private int[] numbers = new int[10];

    
    //Constructor
    public Array(int x, String[] names, int[] numbers){
        this.x = x; 
        this.names = names;
        this.numbers = numbers; 
    }

    
    //get methods
    public int getX(int x){
        this.x = x;
        return x; 
    }

    public int getY(int y){
        this.y = y;
        return y; 
    }

    public String[] getNames(String[] names){
        this.names = names;
        return names; 
    }

    public int[] getNums(int[] numbers){
        this.numbers = numbers;
        return numbers; 
    }

    //set methods
    
    public void setX(int newX){
        x = newX; 
    }

    public void setY(int newY){
        y = newY; 
    }

    //override toString method

    public String toString(){
        
        Arrays.toString(numbers);
        String str = this.x + " " + this.y + " " + Arrays.toString(this.names)+ " " + Arrays.toString(this.numbers);
        return str;
    }

    //loop to print elements in array
    
    public void printLoop(){
    
        for (int i = 0; i < numbers.length; i++){
            System.out.println("Element at index " + i + " : " + numbers[i]);
        }   

        for (int i = 0; i < names.length; i++){
            System.out.println("Element at index " + i + " : " + names[i]);
        } 

        System.out.println(" ");
        
        //nested loop
        for (int i = 0; i < numbers.length; i++){
            System.out.println("Element at index " + i + " : " + numbers[i] + "\n");
            for (int j = 0; j < names.length; j++){
                System.out.println("Element at index " + j + " : " + names[j]);
            } 
            System.out.println("");
        }   

    }
/*

    public void setX(Scanner.input){
        
        int arrayLength = input.nextInt();

    }

    public void select(Scanner.input){
        
        int arrayIndex = input.nextInt();

    }
    
*/

}