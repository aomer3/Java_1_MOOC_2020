/*
Write a program that reads names and birth years from the user until an empty line 
is entered. The name and birth year are separated by a comma.
 
After that the program prints the longest name and the average of the birth years. 
If multiple names are equally longest, you can print any of them. You can assume 
that the user enters at least one person.
 
User enters:
sebastian,2017
lucas,2017
lily,2017
hanna,2014
gabriel,2009
 
Output:
Longest name: sebastian
Average of the birth years: 2014.8
*/
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> birthyears = new ArrayList<>();

        int count = 0;

        while(true){
            String input = scanner.nextLine();

            if(input.isEmpty()){
                break;
            }

            String[] peices = input.split(",");


            names.add(peices[0]);
            birthyears.add(Integer.valueOf(peices[1]));

            count++;
        }

        String longest = names.get(0);
        double sum = 0;
        double average = 0;

        //This task finds the longest name entered by the user.
        for(int i=0; i < names.size(); i++){
            if(names.get(i).length() > longest.length()){
                longest = names.get(i);
            }
        }

        //This task finds the sum of all of the years entered by the user.
        for(Integer year: birthyears){
            sum += year;
        }

        //This task finds the average of the all of the years.
        average = sum / count;

        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + average);
    }
}
 