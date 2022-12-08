package max;

import java.util.Scanner;

public class Max {

    public static void main(String[] args) {
        int arr[] = new int[10];         //make array with 10 positions.
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter 10 elements to calculate max : ");
        int max = (int) -1e7;
        int pos = 0;
        for (int i = 0; i < 10; i++) {     //initialize elemetns of array.
            arr[i] = input.nextInt();
            if (arr[i] > max) {
                max = arr[i];     //store max num in max variable.
                pos = i;         //store position of the max element.
            }
        }
        for (int i = 0; i < 10; i++) {        //print elements of array.
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.println("The max num is : " + max + " at position " + (pos + 1));

    }

}