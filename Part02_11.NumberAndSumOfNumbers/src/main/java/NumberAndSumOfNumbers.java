/*
Write a program that asks the user for input until the user inputs 0. After this the program prints the amount of
numbers inputted and the sum of the numbers. The number zero does not need to be added to the sum, but adding it does
not change the results.

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
Sum of the numbers: 34
 */
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = 0;
        int sum = 0;
        int count = 0;

        //This task counts the numbers entered by the user, and then sums up all of the numbers.
        while(true){
            System.out.println("Give a number:");
            value = Integer.valueOf(scanner.nextLine());

            if(value == 0){
                break;
            }

            if(value != 0){
                count++;
                sum += value;
            }
        }

        //These tasks display the count and the sum of the numbers entered by the user.
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);

    }
}