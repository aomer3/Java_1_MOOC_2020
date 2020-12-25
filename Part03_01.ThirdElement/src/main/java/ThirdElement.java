/*
The exercise contains a base that asks the user for strings and adds them to a
list. The program stops reading when the user enters an empty string. The program
then prints the first element of the list.

Your assignment is to modify the program so that instead of the first value, the
third value on the list is printed.

Output:
Tom
Emma
Alex
Mary

Alex
*/
import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        //This task asks and stores text inputs from the user, then saves in a list.
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        //This task displays the third item on the list.
        System.out.println(list.get(2));
    }
}