// Que- Make a function to Multiply 2 numbers and return the product 

import java.util.*;

public class Multiply{

    public static int multiply(int a, int b){
        // int multiply = a*b;
        return a*b;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // int multiply = multiply(a,b);
        System.out.println(a + "*" + b + "=" + multiply(a,b));
    }
}