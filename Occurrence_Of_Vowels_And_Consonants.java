// write a program to count Occurrence Of Vowels & Consonants in a String.

import java.util.*;

public class Occurrence_Of_Vowels_And_Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase(); // taaki A aur a dono handle ho

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') { // sirf letters
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}