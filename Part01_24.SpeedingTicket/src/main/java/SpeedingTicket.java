/*
Write a program that asks the user for an integer and prints the string "Speeding ticket!" if the input is greater
than 120.

Give speed:
15

Give speed:
135
Speeding ticket!

 */
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This task asks the user to input the speed of the vehicle.
        System.out.println("Give speed:");
        int speed = Integer.valueOf(scanner.nextLine());

        //This tasks only displays a message if the speed entered is above 120 mph.
        if (speed > 120){
            System.out.println("Speeding ticket!");
    }
}
