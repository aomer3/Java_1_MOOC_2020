/*
In the exercise template there is a program that reads inputs from the user and
adds them to a list. Reading is stopped once the user enters an empty string.

Your task is to modify the method to print the last read value after it stops
reading. Print the value that was read last from the list.

Output:
Tom
Emma
Alex
Mary

Marys
*/
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        //This task asks the user to enter text input.
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            //This task adds the text input from the user on  a list.
            list.add(input);
        }

        //This task retrieves the last item on the list.
        String last = list.get(list.size() - 1);

        //This task displays the last item on the list.
        System.out.println(last);

    }
}
