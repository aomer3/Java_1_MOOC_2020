/*
Write a program, which reads an integer from the user. Then the program prints numbers 
from that number to 100. You can assume that the user always gives a number less than 100.

Output(if user enters 99):
99
100
*/

import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This task asks the user to enter the starting number.
        int start = Integer.valueOf(scanner.nextLine());
        int end = 100;


        //This task prints all of the numbers from the starting number to 100.
        for(int i=start; i <= end; i++){
            System.out.println(i);
        }


    }
}