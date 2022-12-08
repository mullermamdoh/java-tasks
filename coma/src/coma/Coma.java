
package coma;

import java.util.Scanner;


public class Coma {

   
    public static void main(String[] args) {
       String str;             //initialize string object.
       Scanner input = new Scanner(System.in);    //make scanner object.
       
       while(true){     //infinite loop.
       System.out.println("Enter string : ");
       str = input.nextLine();
       String newStr = str.replace(",","");   //remove ',' from string and put it in new string.
        System.out.println(newStr);
      }
    }
    
}