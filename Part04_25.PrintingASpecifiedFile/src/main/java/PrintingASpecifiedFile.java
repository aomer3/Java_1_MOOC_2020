/*
Write a program that asks the user for a string, and then prints the contents of a 
file with a name matching the string provided. You may assume that the user provides 
a file name that the program can find.
 
The exercise template contains the files "data.txt" and "song.txt", which you may 
use when testing the functionality of your program. The output of the program can 
be seen below for when a user has entered the string "song.txt". The content that 
is printed comes from the file "song.txt". Naturally, the program should also work 
with other filenames, assuming the file can be found.
*/
import java.nio.file.Paths;
import java.util.Scanner;
 
public class PrintingASpecifiedFile {
 
    public static void main(String[] args) {
        
        //This scanner reads the user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printed?");
        String fileName = scanner.nextLine();
        
        //This scanner reads the file
        try (Scanner reader = new Scanner(Paths.get(fileName))){
            while(reader.hasNextLine()){
                String row = reader.nextLine();
                System.out.println(row);
            }
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
 
    }
}