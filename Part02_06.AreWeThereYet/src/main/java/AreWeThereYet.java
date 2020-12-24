/*
Write a program, according to the preceding example, that asks the user to input values until they input the value 4.

Output of the program:
Give a number:
5
Give a number:
744
Give a number:
22
Give a number:
-1
Give a number:
4
 */
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This task asks the user to enter a number.
        while(true){
            System.out.println("Give a number: (4 = exit)");
            int input = Integer.valueOf(scanner.nextLine());

            if(input == 4){
                break;
            }

            //This tasks displays the number entered by the user.
            System.out.println(input);
        }

    }
}
