/*
This exercise is has two parts.
 
Part 1: Where to
Write a program which prints the integers from 1 to a number given by the user.

Ooutput:
Where to? 3
1
2
3

Part 2: Where from
Ask the user for the starting point as well.

Output:
Where to? 8
Where from? 5
5
6
7
8

If the upper limit is larger than the starting point, nothing is printed.

OUtput:
Where to? 12
Where from? 16
*/
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //This task will ask the user to enter the last number.
        System.out.println("Where to?");
        int lastNumber = Integer.valueOf(scanner.nextLine());

        //This task will ask the user to enter the first number.
        System.out.println("Where from?");
        int startNumber = Integer.valueOf(scanner.nextLine());

        //This task will dispaly the range of nubmers from from the first number to the last.
        while(startNumber <= lastNumber){
            System.out.println(startNumber);
            startNumber++;
        }

    }
}