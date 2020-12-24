/*
Implement a program, which calculates the sum 1+2+3+...+n where n is given as user input.

Sample output:
Last number? 3
The sum is 6
 */
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This task asks the user to enter the last number of the sequence.
        System.out.println("Last number?");
        int lastNumber = Integer.valueOf(scanner.nextLine());
        int startNumber = 1;
        int sum = 0;

        //This task sums up all of the numbers of the sequence.
        for(int i=startNumber; i <= lastNumber; i++){
            sum += i;
        }

        //This task displays the sum of all of the numbers of the sequence.
        System.out.println("The sum is " + sum);

    }
}
