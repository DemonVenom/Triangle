# TriangleVersion-1

⦁	Modify the Triangle class (from assignment 4 above) to throw an exception in the constructor and set routines if the triangle is not valid (i.e., does not satisfy the triangle inequality). Modify the main routine to prompt the user for the sides of the triangle and to catch the exception and re-prompt the user for valid triangle sides. 
In addition, for any valid triangle supply a method to compute and display the area of the triangle using Heron’s method: where a, b, and c are the lengths of the sides and p is 1/2 of the perimeter of the triangle, A = [p(p-a)(p-b)(p-c)]1/2. The area, A, should be a double displayed with 2 digits after the decimal point. Supply a getPerimeter method to compute the perimeter as an integer.
Display the triangle, its area and perimeter and all its other properties ONLY IF the triangle is valid.  Allow the user to repeatedly enter triangle sides and do not exit the process until the user enters 0 for a side 1 length. Here is a sample dialog:



    Enter the sides of the triangle as integers
    Enter 0 for side 1 to exit:
    Enter side 1: 3
    Enter side 2: 4
    Enter side 3: 5
    Triangle with sides: 3 4 5
    Is right
    Is not isosceles
    Is not equilateral
    Area = 6.00
    Perimeter = 12
    Enter the sides of the triangle as integers
    Enter 0 for side 1 to exit:
    Enter side 1: 1
    Enter side 2: 1
    Enter side 3: 2
    Not a valid triangle
    Enter the sides of the triangle as integers
    Enter 0 for side 1 to exit:
    Enter side 1: -1
    Enter side 2: 2
    Enter side 3: 3
    Not a valid triangle
    Enter the sides of the triangle as integers
    Enter 0 for side 1 to exit:
    Enter side 1: 1
    Enter side 2: 2
    Enter side 3: 2
    Triangle with sides: 1 2 2
    Is not right
    Is isosceles
    Is not equilateral
    Area = 0.97
    Perimeter = 5
    Enter the sides of the triangle as integers
    Enter 0 for side 1 to exit:
    Enter side 1: 3
    Enter side 2: 3
    Enter side 3: 3
    Triangle with sides: 3 3 3
    Is not right
    Is isosceles
    Is equilateral
    Area = 3.90
    Perimeter = 9
    Enter the sides of the triangle as integers
    Enter 0 for side 1 to exit:
    Enter side 1: 0
    Exiting



⦁	Do the UML class diagram for the Triangle class (in assignments 4 and 7, above). Supply a class diagram and activity diagrams for every method in the class (excluding the accessor and toString methods, but including the constructors, the predicate methods, and area and perimeter methods).
