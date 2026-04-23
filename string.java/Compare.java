import java.util.*;
public class Compare{
    public static void main(String args[]){
        String name1 = "Sanskar";
        String name2 = "Divyansh";
        // s1 > s2 : +ve value
        // s1 == s2 : 0
        // s1 < s2 : -ve value
        if(name1.compareTo(name2) == 0){
            System.out.println("String are equal:");
        } else{
            System.out.println("String are not equal:");
        }
    }
}