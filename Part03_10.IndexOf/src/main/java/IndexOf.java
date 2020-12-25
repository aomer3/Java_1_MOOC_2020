/*
The exercise template contains a base that reads numbers from the user and adds 
them to a list. Reading is stopped once the user enters the number -1.
 
Expand the program by adding a functionality that asks the user for a number, 
and reports that number's index in the list. If the number is not found, the 
program should not print anything.
 
Output:
72
2
8
8
11
-1
 
Search for? 2
2 is at index 1
*/
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        //This task asks the user to enter in a number.
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            //This task adds the entered number on a list.
            list.add(input);
        }

        //This task asks the user to enter in the number they would like to search for.
        System.out.println("Search for? ");
        int search = Integer.valueOf(scanner.nextLine());

        //This task searches through the list for the entered number.
        for(int i=0; i < list.size(); i++){
            if(search == list.get(i)){
                System.out.println(search + " is at the index " + i);
            }
        }

    }
}