//write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;

public class Que2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            if(i%2 != 0){
                // int a = i;
                // int sum = a+i;
                // System.out.println(sum-1);
                System.out.println(2*i-1);
            }
        }
        sc.close();
    }
}
