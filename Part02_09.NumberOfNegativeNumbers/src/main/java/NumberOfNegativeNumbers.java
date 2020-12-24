/*
Write a program that reads values from the user until they input a 0. After this, the program prints the total number
of inputted values that are negative. The zero that's used to exit the loop should not be included in the total number
count.

Output of program:
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
Number of negative numbers: 1
 */
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = 0;
        int count = 0;

        //This task counts the number of negative numbers entered by the user.
        while(true){
            System.out.println("Give a number:");
            value = Integer.valueOf(scanner.nextLine());

            if (value == 0){
                break;
            }

            if (value < 0){
                count++;
            }
        }

        //This task displays the number of negative numbers entered by the user.
        System.out.println("Number of negative numbers: " + count);

    }
}