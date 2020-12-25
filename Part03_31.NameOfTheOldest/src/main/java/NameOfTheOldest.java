/*
Write a program that reads names and ages from the user until an empty line is entered. 
The name and age are separed by a comma.
 
After reading all user input, the program prints the name of the oldest person. You can 
assume that the user enters at least one person, and the that one of the users is older 
than the others.
 
User enters:
sebastian,2
lucas,2
lily,1
hanna,5
gabriel,10
 
Output:
Name of the oldest: gabriel
*/
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        String[] names = new String[100];
        int[] ages = new int[100];

        while(true){
            String input = scanner.nextLine();

            if(input.isEmpty()){
                break;
            }

            String[] peices = input.split(",");

            //This task stores all of the names and ages into two separate arrays;
            names[count] = peices[0];
            ages[count] = Integer.valueOf(peices[1]);
            count++;

        }
        int oldest = ages[0];
        int index = 0;

        //This task calculates the oldest age in the group.
        for(int i=0; i < ages.length; i++){
            if(ages[i] > oldest){
                oldest = ages[i];
                index = i;
            }
        }

        System.out.println("Name of the oldest: " + names[index]);


    }
}