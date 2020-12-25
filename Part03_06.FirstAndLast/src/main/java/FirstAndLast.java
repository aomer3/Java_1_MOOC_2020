/*
In the exercise template there is a program that reads inputs from the user and 
adds them to a list. Reading is stopped once the user enters an empty string.
 
Modify the program to print both the first and the last values after the reading 
ends. You may suppose that at least two values are read into the list.
 
Output:
Tom
Emma
Alex
Mary
 
Tom
Mary
*/
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        //This task asks the user to enter in a text input.
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            //This task saves the user text input in a list.
            list.add(input);
        }

        //This task retrieves the first item and the last item on the list.
        String first = list.get(0);
        String last = list.get(list.size() - 1);

        //This task displays the first and last item on the list.
        System.out.println(first);
        System.out.println(last);

    }
}