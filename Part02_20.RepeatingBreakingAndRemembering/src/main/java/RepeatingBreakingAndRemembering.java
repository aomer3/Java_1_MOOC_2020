/*
This exercise is a five-part exercise.
Part 1 - Reading
Implement a program that asks the user for numbers (the program first prints "Give numbers: ") 
until the user gives the number -1. When the user writes -1, the program prints "Thx! Bye!" and ends.

Output:
Give numbers:
5
2
4
-1
Thx! Bye!
 
Paet 2 - Sum of numbers 
Extend the program so that it prints the sum of the numbers (not including the -1) the user has written.

Output:
Give numbers:
5
2
4
-1
Thx! Bye!
Sum: 11
 
PART 3 - Sum and the number of numbers
Extend the program so that it also prints the number of numbers (not including the -1) the user has written.

Output:
Give numbers:
5
2
4
-1
Thx! Bye!
Sum: 11
Numbers: 3
 
Part 4 - Average of numbers
Extend the program so that it prints the mean of the numbers (not including the -1) the user has written.

Output:
Give numbers:
5
2
4
-1
Thx! Bye!
Sum: 11
Numbers: 3
Average: 3.666666666666
 
Part 5 - Even and odd numbers
Extend the program so that it prints the number of even and odd numbers (excluding the -1).

Output:
Give numbers:
5
2
4
-1
Thx! Bye!
Sum: 11
Numbers: 3
Average: 3.666666666666
Even: 2
Odd: 1
*/
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Part 1 Reading - This task asks the user for a number.
        System.out.println("Give numbers:");
        int number = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        int countNumbers = 0;
        double average = 0;
        int countEven = 0;
        int countOdd = 0;

        while (true){
            //This task ends the the loop if the user enters -1.
            if(number == -1){
                break;
            }

            //Part 2 Sum of numbers - This task calculates the sum of all numbers entered by the user, not including -1.
            sum += number;
            //Part 3 Number of numbers - This tasks calculates the total of inputs entered by the user.
            countNumbers++;

            //Part 5 Even and odd numbers - This task calculates the total number of even and odd numbers entered by the user.
            if(number % 2 == 0){
                countEven++;
            } else {
                countOdd++;
            }


            //Part 1 Reading - This task continuesly asks the user for a number. When the user types -1, the loop ends.
            number = Integer.valueOf(scanner.nextLine());
        }

        //Part 4 Average of numbers - This task calculates the average of all numbers entered by the user.
        average = (double)sum / countNumbers;

        //Part 1 Reading - This task displays to the screen the message 'Thx! Bye!" when the loop has ended.
        System.out.println("Thx! Bye!");
        //Part 2 Sum of numbers - This task displays to the screen the sum of the numbers entered by the user.
        System.out.println("Sum: " + sum);
        //Part 3 Number of numbers - This task displays the total number of inputs entered by the user.
        System.out.println("Numbers: " + countNumbers);
        //Part 4 Average of numbers - This task displays the average of all numbers entered by the user.
        System.out.println("Average: " + average);
        //Part 5 Even and odd numbers - This task displays the number of even and odd numbers entered by the user.
        System.out.println("Even: " + countEven);
        System.out.println("Odd: " + countOdd);


    }
}
 