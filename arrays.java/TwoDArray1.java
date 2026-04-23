import java.util.*;

public class TwoDArray1{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] num = new int [rows][cols];

        // Input
        // rows
        for(int i=0; i<rows; i++){
            // columns
            for(int j =0; j<cols; j++){
                num [i][j] = sc.nextInt();
            }
        }

        // Output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(num[i][j]+" ");
            }
             System.out.println();
        }
    }
}