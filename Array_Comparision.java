// Write a program for, Given two arrays 1,2,3,4,5 and 2,3,1,0,5 find which number is not present in the second array. 

import java.util.*;

public class Array_Comparision {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,1,0,5};

        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;

            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Missing number: " + arr1[i]);
            }
        }
    }
}