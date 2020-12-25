/*
Write a program that reads numbers from the user. When number 9999 is entered, the 
reading process stops. After this the program will print the smallest number in the 
list, and also the indices where that number is found. Notice: the smallest number 
can appear multiple times in the list.
 
72
2
8
8
11
9999
 
Smallest number: 2
Found at index: 1
*/
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        //This task asks the user to ener in a number.
        while(true){
            int number = Integer.valueOf(scanner.nextLine());

            if(number == 9999){
                break;
            }

            //This task saves the entered number in a list.
            list.add(number);
        }

        int smallest = list.get(0);

        //This task finds the smallest number in the list.
        for(int i=0; i < list.size(); i++){
            if(list.get(i) < smallest){
                smallest = list.get(i);
            }
        }

        System.out.println("Smallest number: " + smallest);

        //This task displays the index of the smallest number, or indeces if there are repeat smallest numbers.
        for(int i=0; i < list.size();i++){
            if(list.get(i) == smallest){
                System.out.println("Found at index: " + i);
            }
        }


    }
}