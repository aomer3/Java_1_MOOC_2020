/*
Write a program that prompts the user for two strings. If the strings are the same, then the program prints "Same".
Otherwise, it prints "Different".

Enter the first string:
hello
Enter the second string:
hello
Same

Enter the first string:
hello
Enter the second string:
world
Different
 */
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //These tasks asks the user to enter in two text inputs, and then saves the two inputs.
        System.out.println("Enter the first string:");
        String first = scan.nextLine();
        System.out.println("Enter the second string:");
        String second = scan.nextLine();

        //This task determines if the two text inputs are the same, then displays a message onto the screen. 
        if(first.equals(second)){
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
