/*
The exercise template contains a program demonstrating the use of conditional statements. It is, however,
incorrectly indented. When you notice how indentation errors are shown, correct them.
 */
import java.util.Scanner;

public class CheckYourIndentation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //This tasks asks two numbers from the user and saves the two user inputs.
        System.out.println("Give a number: ");
        int first = Integer.valueOf(scan.nextLine());
        System.out.println("Give another number: ");
        int second = Integer.valueOf(scan.nextLine());

        //This tasks compares the two numbers and determines which number is greater, then displays in on the screen.
        if (first == second) {
            System.out.println("Same!");
        } else if (first > second) {
            System.out.println("The first was larger than the second!");
        } else {
        System.out.println("The second was larger than the first!");
        }

    }
}
