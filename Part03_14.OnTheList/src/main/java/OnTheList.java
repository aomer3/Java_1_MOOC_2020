/*
In the exercise template there is a program that reads inputs from the user until 
an empty string is entered. Add the following functionality to it: after reading 
the inputs one more string is requested from the user. The program then tell whether 
that string was found in the list or not.
 
Output:
Tom
Emma
Alex
Mary
 
Search for? Mary
Mary was found!
*/
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This task will ask the user to enter a text input.
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            //This task will add the text input entered into a list.
            list.add(input);
        }

        //This task will ask the user for the item you they would like to search for in the list.
        System.out.println("Search for? ");
        String search = scanner.nextLine();

        boolean found = false;

        //This task will search for the item on the list.
        for(int i=0; i < list.size(); i++){
            if(search.equals(list.get(i))){
                found = true;
            }
        }

        //This task will display whether or not the item was found on the list.
        if(found){
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }


    }
}