import java.util.*;
 public class append {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("T");
        System.out.println(sb);

        sb.append("o");
        sb.append("n");
        sb.append("y");
        System.out.println(sb);
        System.out.println(sb.length());
    }
 }