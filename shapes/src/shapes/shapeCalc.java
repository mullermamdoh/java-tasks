package Shapes;

import java.util.Scanner;

class Shape{

    Scanner input = new Scanner(System.in);
    double radius, length, width;

    void getDimensions() {       //method to get radius of circle, length and width of rectangle.
        System.out.println("Enter radius of circle: ");
        radius = input.nextDouble();

        System.out.println("Enter rectangle length, width: ");
        length = input.nextDouble();
        width = input.nextDouble();

    }

    void getCircleArea() {    //calculate circle area and Circumference.
        System.out.printf("area of circle is: %4.2f\n", radius * radius * Math.PI);  //use printf to manipulate output.
        System.out.printf("and Circumference of circle is %4.2f\n",2*Math.PI*radius); // '%4.2f' => four digits with 2 after decimal point. 
    }

    void getRectalgeArea() {   //calculate rectangel area and Circumference.
        System.out.printf("area of retangle is: %4.2f \n", length * width);
        System.out.printf("and Circumference of rectangle is %4.2f\n",2*length*width);
    }

}


public class shapeCalc {

    public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);
            
           
                    Shape shape = new Shape(); //new object of shape class.

                    shape.getDimensions();
                    shape.getCircleArea();
                    shape.getRectalgeArea();

     }
}