import java.util.*;
public class Search{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //for input
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        //search's numbers
        System.out.println("Enter your search number");
        int x = sc.nextInt();

        //for output of search number
        for(int i=0; i<numbers.length; i++){    // i can use "size" replace of "numbers.length"
            if(numbers[i] == x){
                System.out.println("your x at the "+i);
            }
        }
    }
}