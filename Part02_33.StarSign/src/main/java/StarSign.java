/*
Part 1: Printing stars
Define a method called printStars that prints the given number of stars and a line break.
public static void main(String[] args) {
    printStars(5);
    printStars(3);
    printStars(9);
}
The output of the program:
*****
***
*********

Part 2: Printing a square
Define a method called printSquare(int size) that prints a suitable square with the help of the printStars method. So
the method call printSquare(4) results in the following output:
****
****
****
****

Part 3: Printing a rectangle
Write a method called printRectangle(int width, int height) that prints the correct rectangle by using the printStars
method. So the method call printRectangle(17, 3) should produce the following output:
*****************
*****************
*****************

Part 4: Printing a triangle
Create a method called printTriangle(int size) that prints a triangle by using the printStars method. So the call
printTriangle(4) should print the following:
*
**
***
****
 */

public class StarSign {

    public static void main(String[] args) {


        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!

        printStars(5);
        printStars(3);
        printStars(9);

        printSquare(4);

        printRectangle(5, 6);

        printTriangle(4);

    }

    //This task displays lines of stars.
    public static void printStars(int number) {
        for(int i=0; i < number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    //This task displays stars in a square formation.
    public static void printSquare(int size) {
        for(int i=0; i < size; i++){
            printStars(size);
        }
    }

    //This task displays stars in a rectangular formation.
    public static void printRectangle(int width, int height) {
        for(int i=0; i < height; i++){
            printStars(width);
        }
    }

    //This task displays stars in a triangle formation.
    public static void printTriangle(int size) {
        for(int i=0; i <= size; i++){
            printStars(i);
        }
    }

}