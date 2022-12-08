package transpose;

import java.util.Scanner;

class arrays {      

    void getArray(int arr[][], int r, int c) {           //get elements of array.
        Scanner input = new Scanner(System.in); 
        for (int i = 0; i < r; i++) {
            System.out.println("Enter values of row # " + (i+1));
            for (int j = 0; j < c; j++) {
                arr[i][j] = input.nextInt();
            }
        }
    }

    void printArray(int arr[][], int row, int col) {    //print array elements as they are entered.

        System.out.println("The array before transpose ");
        for (int i = 0; i < row; i++) {
            System.out.println();
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }

    void transpose(int arr[][], int row, int col) {     //print transposed matrix.
        System.out.println("\nThe array after tranpose ");
        for (int i = 0; i < col; i++) {
            System.out.println();
            for (int j = 0; j < row; j++) {
                System.out.print(arr[j][i] + " ");
            }
        }

    }

}

public class Transpose {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter dimentions of the array r , c : ");
        int r = 0, c = 0;           
        r = input.nextInt();           //get number of rows and columns.
        c = input.nextInt();
        int arr[][] = new int[r][c];  //initialze array with entered rows and cols.
        arrays obj = new arrays();    //created object of class arrays.
        obj.getArray(arr, r, c);      // invoke methods of the class and pass parameters to it.
        obj.printArray(arr, r, c);
        obj.transpose(arr, r, c);
    }

}