import java.util.*;
public class Length{
    public static void main(String args[]){
        String Firstname = "Sanskar";
        String Lastname = "Chaurasia";
        String Fullname = Firstname+" "+Lastname;
        //length
        System.out.println(Fullname.length());

        //charAt
        for(int i=0; i<Fullname.length(); i++){
            System.out.print(Fullname.charAt(i)+" ");
        }
    }
}