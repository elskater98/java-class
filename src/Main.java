import utils.Utils;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Primitive Types
        char c = 'a';
        char[] chars = {'a', 'b', 'c', 'd'};
        int num = 3;
        double num2 = 4.0;
        int[] arr = new int[30];
        int[] sample_arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[][] arr2d = new int[4][4]; // [[1,2,3,4],[5,6,7,8],[9,0,0,0],[4,5,6,7]]
        boolean bool = true;

        // Strings
        String str= "Hello World";



        // if-else
        if (num == 3) {
            System.out.println(str);
        } else {
            System.out.println("No soy el " + num);
        }

        // while loop -> Search

        int i = 0;
        while (i < sample_arr.length) {
            if (sample_arr[i] == 5) break;
            System.out.println(sample_arr[i]);
            i++;
        }

        // for loop -> Iterate
        for (int j = 0; j < sample_arr.length; j++) {
            System.out.println(sample_arr[j]);
        }

        // Iterate 2D Array by rows
        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                arr2d[row][col] = row * col;
                System.out.println("(" + row + "," + col + ")");
                //System.out.println("("+col+","+row+")");
            }
        }

        // Call Utils
        Utils u = new Utils();
        u.getCurrentDay();

        // https://stackoverflow.com/questions/5287538/how-to-get-the-user-input-in-java
        System.out.println(Arrays.deepToString(arr2d));


        // Input library
        Scanner userInput = new Scanner(System.in);
        int age = userInput.nextInt();
        System.out.println(age);
    }

}