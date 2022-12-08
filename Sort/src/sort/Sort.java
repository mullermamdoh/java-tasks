
import java.util.Scanner;

class Quicksort {

    static int partition(int array[], int low, int high) {     //find partition position.

        int pivot = array[high];    //use rigthmost element as a pivot.

        int i = (low-1);  //point to the greater element.

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {  
                i++;                     //compare every element with the pivot.
                int temp = array[i];      //swap elemnts.
                array[i] = array[j];
                array[j] = temp;
                
            }
        }
        int temp = array[i+1];          //swap the pivot element with the greater element specified by i.
        array[i + 1] = array[high];
        array[high] = temp;
        return (i+1);                   //return position where partition is done.
    }

    static void quickSort(int array[], int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot - 1);      //call the left of pivot recursively
            quickSort(array, pivot + 1, high);    //call the right of pivot recursively
        }
    } 
      static void printArr(int arr[]){  //print elements of array.
     for (int i = 0; i < 10; i++)
            System.out.print(arr[i]+" ");
    }
}

public class Sort {

    public static void main(String args[]) {

        int arr[]=new int[10];
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter 10 elements to sort: ");
        for (int i = 0; i < 10; i++)
            arr[i]=sc.nextInt();
         
        System.out.println("Before sorting ");     //print unsorted array
        Quicksort.printArr(arr);
        
        int size = arr.length;
        Quicksort.quickSort(arr, 0, size-1);
        System.out.println("\nAfter sorting ");
         Quicksort.printArr(arr);
                 
    }
}