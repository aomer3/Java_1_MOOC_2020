/*
Write a program that prompts the user for a filename, as well as the upper and lower 
bounds for the accepted range of numbers. Then the program reads the numbers contained 
in the file (each number is on its own line) and only accounts for the numbers which 
are inside the given range. Finally, the program should print the number of numbers 
that were inside the given range.
 
Output:
File? numbers-1.txt
Lower bound? 15
Upper bound? 20
Numbers: 2
*/
import java.nio.file.Paths;
import java.util.Scanner;
 
public class NumbersFromAFile {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
       
        try(Scanner reader = new Scanner(Paths.get(file))){
            int count = 0;
            while(reader.hasNextLine()){
                int number = Integer.valueOf(reader.nextLine());
                
                if(number >= lowerBound && number <= upperBound){
                    count++;
                }
            }
            System.out.println("Numbers: " + count);
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
 
    }
 
}