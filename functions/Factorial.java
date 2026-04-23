// Que- Make a function to Multiply 2 numbers and return the product 

import java.util.*;

public class Factorial{

    public static int factorial(int n){
        int factorial = 1;
        for(int i=1; i<=n; i++){
             factorial = factorial * (i);
             System.out.println(factorial);
        }
        System.out.println("The Factorial Of "+n+" is: "+factorial);
        return factorial;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();

        factorial(n);
    }
}