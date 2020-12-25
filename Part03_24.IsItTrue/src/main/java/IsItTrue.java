/*
Write a program that asks the user for a string. If the user writes the string "true", 
the program prints "You got it right!", otherwise it prints "Try again!".
 
Output:
Give a string: true
You got it right!
 
Output:
Give a string: trueish
Try again!
*/
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string: ");
        String input = scanner.nextLine();

        //This task determines if the entered word is "true" and then displays a message. 
        if(!(input.equals("true"))){
            System.out.println("Try again!");
        } else{
            System.out.println("You got it right!");
        }

    }
}
 