/*
Write a program that prompts the user for a number and informs us whether it is even or odd.

Give a number:
2
Number 2 is even.

Give a number:
7
Number 7 is odd.
 */
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //This task asks the user to enter a number, then saves the user input.
        System.out.println("Give a number:");
        int value = Integer.valueOf(scan.nextLine());

        //This tasks determines if the number is odd or even, then displays a message onto the screen. 
        if (value % 2 == 0){
            System.out.println("Number " + value + " is even.");
        } else {
            System.out.println("Number " + value + " is odd.");
        }
    }
}
