/*
Write a program that prompts the user for their age and tells them whether or not they are an adult (18 years old
or older).

How old are you?
12
You are not an adult

How old are you?
32
You are an adult
 */
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //This task asks the user to enter in their age, and saves the user input.
        System.out.println("How old are you?");
        int age = Integer.valueOf(scan.nextLine());

        //This task determines if the user is an adult and displays a message onto the screen. 
        if(age >= 18 ) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult.");
        }
    }
}
