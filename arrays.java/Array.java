import java.util.*;
public class Arrays {
    public static void main(String args[]){
        // int[] marks = new int[3];
        int marks[] = new int[3]; //both same
        marks[0] = 75; //physics
        marks[1] = 93; //chemistry
        marks[2] = 78; //math

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        
        for(int i=0; i<3; i++){
            System.out.println(marks[i]);
        }
    }
}