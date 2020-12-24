/*
Write a program that prompts the user for a year. If the user inputs a number that is smaller than 2015, then the
program prints the string "Ancient history!".
 */
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //This task asks the user to enter a year and saves the user input.
        System.out.println("Give a year:");
        int value = Integer.valueOf(scan.nextLine());

        //This task determines if the year is before 2015, and displays a message only if the year is prior to 2015.
        if(value < 2015){
            System.out.println("Ancient history!");
        }
    }
}
