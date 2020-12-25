/*
The exercise template contains a base that reads numbers from the user and adds 
them to a list. Reading is stopped once the user enters the number -1.
 
Continue developing the program so that it finds the greatest number in the list 
and prints its value after reading all the numbers. The programming should work in 
the following manner.
 
Output:
72
2
8
93
11
-1
 
The greatest number: 93
*/
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        //This task asks the user to enter in a number.
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            //This task saves the entered number on a list.
            list.add(input);
        }

        int greatestNumber = 0;

        //This task determines the greatest number on the list.
        for(int i=0; i < list.size(); i++){
            if(list.get(i) > greatestNumber){
                greatestNumber = list.get(i);
            }
        }

        //This task displays the greatest number on the list.
        System.out.println("The greatest number: " + greatestNumber);

    }
}