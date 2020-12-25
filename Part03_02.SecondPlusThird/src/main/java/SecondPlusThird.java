/*
In the exercise template there is a program that reads integers from the user and
adds them to a list. This ends when the user enters 0. The program then prints the
first value on the list.

Modify the program so that instead of the first value, the program prints the sum
of the second and third numbers.

Output:
1
3
5
7
0

8
*/
import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        //This task asks the user to enter in a number.
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }

            //This task saves the number entered in a list.
            numbers.add(number);
        }

        //This task calculates the sum of the second and third number on the list.
        int sum = numbers.get(1) + numbers.get(2);

        //This task displays the sum of the second and third number on the list.
        System.out.println(sum);
    }
}