/*
Write a program that reads an integer from the user. Next, the program prints numbers from 0 to the number given by
the user. You can assume that the user always gives a positive number.

Output(if user enters 4):
0
1
2
3
4
 */
import java.util.Scanner;

import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int current = 0;
        int end = 0;

        //This task asks the user to enter the last number.
        end = Integer.valueOf(scanner.nextLine());

        //This task prints all of the numbers from 0 to the last number.
        for(int i=current; i <= end; i++){
            System.out.println(i);
        }



    }
}

 