/*
Write a program that prompts the user for a password. If the password is "Caput Draconis" the program prints
"Welcome!". Otherwise, the program prints "Off with you!"

Password?
Wattlebird
Off with you!

Password?
Caput Draconis
Welcome!
 */
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //This task asks the user to enter their password, and saves the user input.
        System.out.println("Password?");
        String password = scan.nextLine();

        //This task determines if the password entered is correct, and dispalys a message onto the screen.
        if (password.equals("Caput Draconis")){
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
