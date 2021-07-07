
import java.util.Scanner;

public class DriverT {

    // Provide a driver in a separate source file to test your class by prompting the user for the triangle sides

    public static void main(String[] args) {


        int[] triangleSides = new int[3];

        // Create new scanner
        Scanner scnr = new Scanner(System.in);

        // Create do while loop to repeat infinitely (unless break input is inputted)
        do {

            System.out.println("Enter the sides of the triangle as integers\nEnter 0 for side 1 to exit:");

            boolean flag = false;

            TriangleNew myObj = null;
            do {
                // Create for loop to iterate through array indexes
                for (int i = 0; i < 3; i++) {

                    // Instruct the user to input triangle side value at index i
                    System.out.printf("Enter side %d: => ", i + 1);

                    // Store value in triangle side array
                    triangleSides[i] = scnr.nextInt();

                    // Create if statement to exit loop when a 0 is entered
                    if (triangleSides[0] == 0){
                        break;
                    }

                }

                // Create if statement to exit loop when a 0 is entered
                if (triangleSides[0] == 0){
                    break;
                }



                // Create object of class Triangle to call the constructor
                //
                try {
                    myObj = new TriangleNew(triangleSides);
                    flag = false;
                } catch (Exception e) {
                    System.out.println("Not a valid triangle, try again");
                    flag = true;
                }
            }
            while(flag == true);


            // Create if statement to exit loop when a 0 is entered
            if (triangleSides[0] == 0){
                System.out.println("Exiting");
                break;
            }

            try {
                myObj.setTriangleSides(triangleSides);
                System.out.println(myObj);
            } catch (Exception e) {
                System.out.println("Not a valid triangle");
            }



            // If isTriangle boolean is true, call isRight, isIsosceles, and isEquilateral methods
            if (myObj.isTriangle == true) {

                myObj.isRightTriangle = myObj.isRight(myObj.triangleSides, myObj.isRightTriangle);
                myObj.isIsoscelesTriangle = myObj.isIsosceles(myObj.triangleSides, myObj.isIsoscelesTriangle);
                myObj.isEquilateralTriangle = myObj.isEquilateral(myObj.triangleSides, myObj.isEquilateralTriangle);


                // Use isRightTriangle booleans to report back to the user
                if (myObj.isRightTriangle == true) {
                    System.out.println("is a right triangle");
                } else {
                    System.out.println("is not a right triangle");
                }

                // Use isIsoscelesTriangle booleans to report back to the user
                if (myObj.isIsoscelesTriangle) {
                    System.out.println("is an isosceles triangle");
                } else {
                    System.out.println("is not an isosceles triangle");
                }

                // Use isEquilateralTriangle booleans to report back to the user
                if (myObj.isEquilateralTriangle == true) {
                    System.out.println("is an equilateral triangle");
                } else {
                    System.out.println("is not an equilateral triangle");
                }

                System.out.printf("Area = %.2f\n", myObj.computeArea(triangleSides));

                System.out.printf("Perimeter = %d\n", myObj.getPerimeter(triangleSides));

            }
            // Create new line
            System.out.println();


        }
        while(triangleSides[0] != 0);
    }
}