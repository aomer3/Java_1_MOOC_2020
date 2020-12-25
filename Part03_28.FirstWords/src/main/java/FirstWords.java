/*
Write a program that reads user input until an empty line is entered. For each 
non-empty line the program splits the string by spaces and prints the first part 
of the string.
 
Output(if user enters "this is a very important message"):
this
*/
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String input = scanner.nextLine();

            if(input.isEmpty()){
                break;
            }

            //This task splits the input into individual words and saves them into an array.
            String[] peices = input.split(" ");
            System.out.println(peices[0]);
        }


    }
}