/*
Write a program that asks the user for input until the user inputs 0. After this, the program prints the average of the
numbers. The number zero does not need to be counted to the average. You may assume that the user inputs at least one
number.

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
Average of the numbers: 8.5
 */
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = 0;
        int count = 0;
        double sum = 0;
        double average = 0;

        //This task sums up the numbers entered by the user.
        while(true){
            System.out.println("Give a number:");
            value = Integer.valueOf(scanner.nextLine());

            if(value == 0){
                break;
            }

            if (value != 0){
                count++;
                sum += value;
            }
        }

        //This task determines the average of the numbers entered by the user.
        average = sum / count;

        //This task displays the average of of the numbers entered by the user.
        System.out.println("Average of the numbers: " + average);


    }
}