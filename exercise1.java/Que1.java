//Enter 3 numbers from the usre and make a function to print their average.
import java.util.*;
public class Que1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter physics number:");
        float physics = sc.nextInt();
        System.out.println("Enter chemistry number");
        float chemistry = sc.nextInt();
        System.out.println("Enter math number");
        float math = sc.nextInt();
        
        float average = (physics+chemistry+math)/3;
        System.out.println("The average is "+average);
    }
}