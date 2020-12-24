/*
Write a program that reads numbers from the user until the user inputs a number 0. After this the program outputs the
sum of the numbers. The number zero does not need to be added to the sum, even if it does not change the results.

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
Sum of the numbers: 34
 */
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = 0;
        int sum = 0;
        int count = 0;

        //This tasks sums up the numbers entered by the user.
        while(true){
            System.out.println("Give a number:");
            value = Integer.valueOf(scanner.nextLine());

            if (value == 0){
                break;
            }

            if (value != 0){
                sum += value;
            }
        }

        //This task displays the sum of numbers entered by the user.
        System.out.println("Sum of the numbers: " + sum);

    }
}