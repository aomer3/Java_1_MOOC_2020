/*
Write a program by using the loop example that asks "Shall we carry on?" until the user inputs the string "no".

Output of the program:
Shall we carry on?
yes
Shall we carry on?
ye
Shall we carry on?
y
Shall we carry on?
no
 */
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This task repeats a question until the user says "no".
        while (true) {
            System.out.println("Shall we carry on? (no = exit)");
            String input = scanner.nextLine();

            if(input.equals("no")){
                break;
            }

        }

    }
}
