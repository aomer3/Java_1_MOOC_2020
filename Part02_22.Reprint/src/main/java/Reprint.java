/*
Expand the previous program so that the main program asks the user for the number of times the phrase will be printed
(i.e. how many times the method will be called).

Sample output:
How many times?
7
In a hole in the ground there lived a method
In a hole in the ground there lived a method
In a hole in the ground there lived a method
In a hole in the ground there lived a method
In a hole in the ground there lived a method
In a hole in the ground there lived a method
In a hole in the ground there lived a method
 */
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This task asks the user to enter how many times the message should be displayed on the screen.
        System.out.println("How many times?");
        int numRepeat = Integer.valueOf(scanner.nextLine());
        int counter = 1;

        //This task displays the message on the screen a number of times, as entered by the user.
        while(counter <= numRepeat){
            printText();
            counter++;
        }
    }

    // Don't change the next line that defines the method!
    // (We aren't giving a method a parameter yet)
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}