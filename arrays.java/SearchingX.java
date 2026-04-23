// Que - Take an Array as input from user. Search for a given number X and print the index at which it occurs.

import java.util.*;

public class SearchingX{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length Of Array:");
        int length = sc.nextInt();
        int arr[] = new int[length];

        System.out.println("Enter Array Elements:");
        //For Input
         for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Search Element:");

        int x = sc.nextInt();

       //For Output
       for(int i=0; i<arr.length; i++){
        if(arr[i] == x){
            System.out.println("x Found At "+arr[i]+ " Index:");
            return;
        }
       }
       System.out.println("Your Input Is Not In Array ❌:");
    }
}