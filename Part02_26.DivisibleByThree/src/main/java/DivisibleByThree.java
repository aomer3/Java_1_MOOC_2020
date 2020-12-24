/*
Write a method public static void divisibleByThreeInRange(int beginning, int end) that prints all the numbers divisible
by three in the given range. The numbers are to be printed in order from the smallest to the greatest.

Output (if range input is 3,6):
3
6
 */
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Start number?");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Last number?");
        int second = Integer.valueOf(scanner.nextLine());

        divisibleByThreeInRange(first, second);
    }

    //This tasks displays the numbers that are divisible by three, in the range of numbers entered by the user.
    public static void divisibleByThreeInRange(int beginning, int end){

        while(beginning <= end){
            if(beginning % 3 == 0){
                System.out.println(beginning);
            }

            beginning++;
        }
    }

}
