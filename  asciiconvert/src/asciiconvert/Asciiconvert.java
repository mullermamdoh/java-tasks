package asciiconvert;

import java.util.Scanner;

public class AsciiConvert {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);               //make Scanner object
        while (true) {                                     //infinite loop
            System.out.print("Enter ascii code : ");
            int ch;
            ch = input.nextInt();                             //get intiger input from user
            char st = (char) ch;                           //convert int to ascii 

            System.out.println("the ascii char is : " + st);
        }
    }

}