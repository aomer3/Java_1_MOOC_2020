/*
Write a program that reads user input until an empty line. For each non-empty string, 
the program splits the string by spaces and then prints the pieces that contain av, 
each on a new line.
 
Output:
Do you have a favorite flavor
have
favorite
flavor
 
was it a cat?
*/
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String input = scanner.nextLine();

            if(input.isEmpty()){
                break;
            }

            //This task splits the user input into separate words and stores them in an array.
            String[] message = input.split(" ");

            //This task prints only the entered words that contain "av".
            for(String word: message){
                if(word.contains("av")){
                    System.out.println(word);
                }
            }
        }


    }
}