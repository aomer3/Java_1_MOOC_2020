/*
The exercise template contains a base that reads numbers from the user and adds 
them to a list. Reading is stopped once the user enters the number -1.
 
When reading ends, calculate the average of the numbers in it, and then print that 
value.
 
Output:
72
2
8
11
-1
 
Average: 23.25
*/
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        int count = 0;

        //This task asks the user to enter in a number.
        while(true){
            int number = Integer.valueOf(scanner.nextLine());

            if(number == -1){
                break;
            }

            //This task keeps track of how many numbers the user enters.
            count++;

            //This task adds the entered numbers into a list.
            numbers.add(number);
        }

        double sum = 0;
        double average = 0;

        //This task calculates the sum of the numbers.
        for(Integer number: numbers){
            sum += number;
        }

        //This task calculates the average of the numbers.
        average = sum / count;

        //This task displays the average of the numbers.
        System.out.println("Average: " + average);

    }
}