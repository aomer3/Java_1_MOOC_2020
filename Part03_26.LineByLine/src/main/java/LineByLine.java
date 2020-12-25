/*
Write a program that reads strings from the user. If the input is empty, the program 
stops reading input and halts. For each non-empty input it splits the string input 
by whitespaces and prints each part of the string on a new line.
 
Output(if user enters "once upon a time"):
once
upon
a
time
*/
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String input = scanner.nextLine();

            if(input.isEmpty()){
                break;
            }

            //This task splits the user input after each whitespace and saves each word into an array.
            String[] message = input.split(" ");

            for(String word: message){
                System.out.println(word);
            }
        }


    }
}