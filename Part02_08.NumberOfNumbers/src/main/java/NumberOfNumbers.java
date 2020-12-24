/*
Write a program that reads values from the user until they input a 0. After this, the program prints the total number
of inputted values. The zero that's used to exit the loop should not be included in the total number count.

Output of the program:
Give a number:
5
Give a number:
22
Give a number:
9
Give a number:
-2
Give a number:
0
Number of numbers: 4
 */
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = 0;
        int count = 0;

        //This task counts the number of numbers entered by the user.
        while(true){
            System.out.println("Give a number (0 exits):");
            value = Integer.valueOf(scanner.nextLine());

            if(input == 0){
                break;
            }

            if(input != 0){
                count++;
            }

        }

        //This task displays how many numbers were entered by the user.
        System.out.println("Number of numbers: " + count);

    }
}