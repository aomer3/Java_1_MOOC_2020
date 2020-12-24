/*
Implement a program which calculates the sum of a closed interval, and prints it. Expect the user to write the smaller
number first and then the larger number.

Sample output:
First number? 3
Last number? 5
The sum is 12
 */
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This task asks the user the first and last number of the sequence.
        System.out.println("First number?");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        int sum = 0;

        //This task sums up all of the numbers in the sequence.
        while(firstNumber <= secondNumber){
            sum += firstNumber;
            firstNumber++;
        }

        //This tasks displays the sum of all of the numbers in the sequence.
        System.out.println("The sum is " + sum);

    }
}