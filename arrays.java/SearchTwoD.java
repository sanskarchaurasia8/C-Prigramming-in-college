import java.util.*;

public class SearchTwoD{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] arr = new int[rows][cols];

        // Input
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        // Searching
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(x == arr[i][j]){
                    System.out.println("x Found At Index" + "("+i+","+j+")");
                    break;
                }
            }
        }
    }
}