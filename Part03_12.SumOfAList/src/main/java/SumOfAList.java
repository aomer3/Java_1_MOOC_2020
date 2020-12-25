/*
The exercise template contains a base that reads numbers from the user and adds 
them to a list. Reading is stopped once the user enters the number -1.
 
Modify the program so that after reading the numbers it calculates and prints the 
sum of the numbers in the list.
 
Output:
72
2
8
11
-1
 
Sum: 93
*/
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        //This task asks the user to enter a number.
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            //This task saves the entered number into a list.
            list.add(input);
        }

        int sum = 0;

        //This task calculates the sum of the numbers on the list.
        for(Integer number: list){
            sum += number;
        }

        //This task displays the sum of the numbers. 
        System.out.println("SUm: " + sum);
    }
}