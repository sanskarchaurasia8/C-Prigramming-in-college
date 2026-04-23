// Take an array of names as input from the user and print them on the screen.
import java.util.*;
public class Que1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
            // for input
            for(int i=0; i<size; i++){
                numbers[i] = sc.nextInt();
            }
            // for output
            for(int i=0; i<size; i++){
                System.out.println(numbers[i]);
            }
        
    }
}