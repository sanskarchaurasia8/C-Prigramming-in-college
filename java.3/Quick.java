import java.util.Scanner;

public class Quick {
    public static void main(String args[]){
        int b = 50;
        Scanner SC = new Scanner(System.in);
        int a = SC.nextInt();

        if(a < b){
            System.out.println("a is smaller");
        } else if(a > b ){
            System.out.println("a is greater");
        }else{
            System.out.println("a and b are equal");
        }
    }
}