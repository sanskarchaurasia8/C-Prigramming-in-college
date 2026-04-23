import java.util.Scanner;

public class Que1 {
    public static void main(String args[]){
        Scanner SC = new Scanner(System.in);
        int a = SC.nextInt();
        int b = SC.nextInt();
         int operator = SC.nextInt();

        switch (operator) {
            case 1: System.out.println(a+b);
                
                break;
                case 2: System.out.println(a-b);
                
                break;
                case 3: System.out.println(a*b);
                
                break;
                case 4: if(b==0){
                    System.out.println("invalide division");
                }else{
                 System.out.println(a/b);
                }
                break;
                case 5: if(b==0){
                    System.out.println("invalide division");
                }else{
                 System.out.println(a%b);
                }
            default:
                System.out.println("invalid operator");
                break;
        }
    }
}
