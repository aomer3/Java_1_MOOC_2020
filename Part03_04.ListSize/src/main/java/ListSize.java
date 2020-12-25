/*
In the exercise template is a program that reads input from the user. Modify its
working so that when the program quits reading, the program prints the number of
values on the list.

Output:
Tom
Emma
Alex
Mary

In total: 4
*/
import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        //This task asks the user to enter in text inputs.
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        //This task displays the total number of items on the list.
        System.out.println("in total: " + list.size());

    }
}