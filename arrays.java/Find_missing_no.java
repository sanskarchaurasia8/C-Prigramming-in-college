// Write a program in array 1-100 numbers are stored, one number is missing how do you find it. 

public class Find_missing_no {
    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5,6,8,9,10};

        boolean found = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != 1) {

                for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
                    System.out.println("Missing: " + j);
                }

                found = true;
            }
        }

        if (!found) {
            System.out.println("Array is correct");
        }
    }
}