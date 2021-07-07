
import java.io.*;
import java.util.Scanner;

public class TriangleNew {

    // Create array of integers to store triangle sides
    int[] triangleSides;
    // Create booleans to confirm aspects of the triangle
    boolean isTriangle, isRightTriangle, isIsoscelesTriangle, isEquilateralTriangle;


    // Create a class constructor for the Triangle class
    public TriangleNew(int[] triangleSides) throws Exception{

        isTriangle = false;
        isRightTriangle = false;
        isIsoscelesTriangle = false;
        isEquilateralTriangle = false;

        setTriangleSides(triangleSides);

        isTriangle = isValid(triangleSides, isTriangle);

        if (isTriangle == false) {
            throw new Exception("EX: 1");
        }


    }


    // Getter
    public int[] getTriangleSides() {

        return triangleSides;
    }
    // Setter
    public void setTriangleSides(int[] triangleSides) {

        try {
            isTriangle = isValid(triangleSides, isTriangle);
        } catch (Exception e) {

            System.out.println("Not a valid triangle");
        }

        this.triangleSides = triangleSides;
    }

    // Getter Perimeter
    public int getPerimeter(int[] triangleSides) {

        int perimeter = 0;

        for (int i = 0; i < 3; i++) {

            perimeter = perimeter + triangleSides[i];
        }

        return perimeter;
    }



    @Override
    public String toString() {

        // Return the user input
        return String.format("Triangle with sides: %d %d %d",
                triangleSides[0], triangleSides[1], triangleSides[2]);

    }


    public static boolean isRight(int[] triangleSides, boolean isRightTriangle) {

        // Use pythagorean theorem to in every possible side variation to find if triangle is a right triangle
        if (((triangleSides[0]*triangleSides[0]) == ((triangleSides[1]*triangleSides[1]) + (triangleSides[2]*triangleSides[2]))) ||
                ((triangleSides[1]*triangleSides[1]) == ((triangleSides[0]*triangleSides[0]) + (triangleSides[2]*triangleSides[2]))) ||
                ((triangleSides[2]*triangleSides[2]) == ((triangleSides[0]*triangleSides[0]) + (triangleSides[1]*triangleSides[1])))) {

            // If one of the variations proves pythagorean theorem, set boolean to true
            isRightTriangle = true;
        }
        // If not, set boolean to false
        else {
            isRightTriangle = false;
        }
        return isRightTriangle;
    }

    public static boolean isIsosceles(int[] triangleSides, boolean isIsoscelesTriangle) {

        // Use congruent sides in every possible side variation to find if triangle is a isosceles triangle
        if ((triangleSides[0] == triangleSides[1]) ||
                (triangleSides[0] == triangleSides[2]) ||
                (triangleSides[1] == triangleSides[2]))  {
            // If one of the variations proves congruence, set boolean to true
            isIsoscelesTriangle = true;
        }
        // If not, set boolean to false
        else {
            isIsoscelesTriangle = false;
        }
        return isIsoscelesTriangle;
    }

    public static boolean isEquilateral(int[] triangleSides, boolean isEquilateralTriangle) {

        // Use transitive property to find if triangle is equilateral
        if ((triangleSides[0] == triangleSides[1]) && (triangleSides[0] == triangleSides[2])) {
            // If transitive property is proved, set boolean to true
            isEquilateralTriangle = true;
        }
        // If not, set boolean to false
        else {
            isEquilateralTriangle = false;
        }
        return isEquilateralTriangle;
    }


    public static boolean isValid(int[] triangleSides, boolean isTriangle) {

        // Verify that the 3 sides satisfy the triangle inequality to find if it is a triangle
        if ((triangleSides[0] + triangleSides[1] > triangleSides[2])
                && (triangleSides[1] + triangleSides[2] > triangleSides[0])
                && (triangleSides[0] + triangleSides[2] > triangleSides[1])) {

            // If triangle triangle inequality is satisfied, set boolean to true
            isTriangle = true;
        }
        else {
            isTriangle = false;
        }

        return isTriangle;

    }


    public double computeArea(int[] triangleSides){

        double p = getPerimeter(triangleSides);

        p = p / 2;

        double area = Math.pow((p * (p - triangleSides[0]) * (p - triangleSides[1]) * (p - triangleSides[2])), 0.5);

        return area;
    }


}