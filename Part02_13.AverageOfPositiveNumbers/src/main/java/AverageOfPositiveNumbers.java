/*
Write a program that asks the user for input until the user inputs 0. After this, the program prints the average of
the positive numbers (numbers that are greater than zero).

OUtput:
3
5
1
-3
0
3.0

If no positive number is inputted, the program prints "Cannot calculate the average".

Output:
0
Cannot calculate the average
 */
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = 0;
        int count = 0;
        double sum = 0;
        double average = 0;

        //This task calculates the sum of only the positive numbers entered by the user.
        while(true){
            System.out.println("Give a number:");
            value = Integer.valueOf(scanner.nextLine());

            if(value == 0){
                break;
            }

            if(value > 0){
                count++;
                sum += value;
            }
        }

        //This task displays the average of numbers only if at least one positive number is entered by the user.
        if (count > 0){
            average = sum/count;
            System.out.println("Average of positive numbers: " + average);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
 