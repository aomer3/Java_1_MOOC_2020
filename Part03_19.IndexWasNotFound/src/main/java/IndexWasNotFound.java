/*
The exercise template already has an array containing numbers. Complete the program 
so that it asks the user for a number to search in the array. If the array contains 
the given number, the program tells the index containing the number. If the array 
doesn't contain the given number, the program will advise that the number wasn't found.
 
Output:
Search for? 3
3 is at index 4.
 
Output:
Search for? 22
22 was not found.
*/

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());

        boolean found = false;
        int index=0;

        //This task searches for the requested number in the list.
        while(index < array.length){
            if(searching == array[index]){
                found = true;
                System.out.println(searching + " is at index " + index + ".");
            }

            index++;
        }

        if(found == false){
            System.out.println(searching + " was not found.");
        }
    }

}