/*
Part 1: Count
Create a class Statistics that has the following functionality (the file for the 
class is provided in the exercise template):
 
a method addNumber adds a new number to the statistics
a method getCount tells the number of added numbers
The class does not need to store the added numbers anywhere, it is enough for it 
to remember their count. At this stage, the addNumber method can even neglect the 
numbers being added to the statistics, since the only thing being stored is the 
count of numbers added.
 
Output if user enters(method addNumbers 3,5,1,2):
Count: 4
 
Part 2: Sum and average
Expand the class with the following functionality:
 
the sum method tells the sum of the numbers added (the sum of an empty number 
statistics object is 0)
the average method tells the average of the numbers added (the average of an empty 
number statistics object is 0
 
Output (same user entry as Part 1):
Count: 4
Sum: 11
Average: 2.75
 
Part 3: Sum of user input
Write a program that asks the user for numbers until the user enters -1. The program 
will then provide the sum of the numbers.
 
The program should use a Statistics object to calculate the sum.
 
NOTE: Do not modify the Statistics class in this part. Instead, implement the program 
for calculating the sum by making use of it.
 
Output:
Enter numbers:
4
2
5
4
-1
Sum: 15
 
Part 4: Multiple sums
Change the previous program so that it also calculates the sum of even and odd numbers.
 
NOTE: Define three Statistics objects in the program. Use the first to calculate the 
sum of all numbers, the second to calculate the sum of even numbers, and the third 
to calculate the sum of odd numbers.
 
Output:
Enter numbers:
4
2
5
2
-1
Sum: 13
Sum of even numbers: 8
Sum of odd numbers: 5
*/
import java.util.Scanner;
 
public class MainProgram {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Statistics statistics = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        
        System.out.println("Enter numbers:");
        
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == -1){
                break;
            }
            
            statistics.addNumber(number);
            
            if(number % 2 == 0){
                even.addNumber(number);
            } else {
                odd.addNumber(number);
            }
        }
 
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
        
    }
}