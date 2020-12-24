/*
Write a program that reads two integers from the user. If the first number is greater than the second, the program
prints "(first) is greater than (second)." If the first number is less than the second, the program prints "(first) is
smaller than (second)." Otherwise, the program prints "(first) is equal to (second)." The (first) and (second) should
always be replaced with the actual numbers that were provided by the user.

Output of the program;
8
4
8 is greater than 4.

Output of the program:
1
1
1 is equal to 1.
 */
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This task asks the user to enter two numbers.
        System.out.println("Give first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give second number:");
        int second = Integer.valueOf(scanner.nextLine());

        //This task compares the two nubmers entered and displays the greater number, or a tie.
        if(first > second){
            System.out.println(first + " is greater than " + second + ".");
        } else if (second > first) {
            System.out.println(first + " is smaller than " + second + ".");
        } else {
            System.out.println(first + " is equal to " + second + ".");
        }

    }
}