/*
The exercise template contains a base that reads numbers from the user and adds 
them to a list. Reading is stopped once the user enters the number -1.
 
Expand the program to ask for a start and end indices once it has finished asking 
for numbers. After this the program shall prints all the numbers in the list that 
fall in the specified range (between the indices given by the user, inclusive). 
You may assume that the user gives indices that match some numbers in the list.
 
Output:
72
2
8
11
-1
 
From where? 1
To where? 2
2
8
*/
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        //This task asks the user to enter a number.
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            //This task saves the entered number on a list.
            numbers.add(number);
        }

        //This task asks the user for the first and last number of the range to be printed.
        System.out.println("From where? ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("To where? ");
        int last = Integer.valueOf(scanner.nextLine());

        //This task displays the numbers on the list that are within the specified range.
        for(int i= first; i <= last; i++){
            System.out.println(numbers.get(i));
        }

    }
}