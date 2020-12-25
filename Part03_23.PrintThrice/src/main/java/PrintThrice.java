/*
Write a program, that reads a string from the user and then prints it three times.
 
Output:
Give a word: cake
cakecakecake
*/
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a word: ");
        String word = scanner.nextLine();

        //This task prints an entered word three times.
        for(int i=0; i < 3; i++){
            System.out.print(word);
        }

    }
}