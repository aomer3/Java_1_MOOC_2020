/*
Write a program that prints the contents of a file called "data.txt", such that 
each line of the file is printed on its own line.
*/

//Need to import java.nio.file.Paths to read files
import java.nio.file.Paths;
import java.util.Scanner;
 
public class PrintingAFile {
 
    public static void main(String[] args) {
        
        //Need to create a scanner to read the file
        try(Scanner scanner = new Scanner(Paths.get("data.txt"))){
            
            //Read the file until all lines have been read
            while(scanner.hasNextLine()){
                
                //Read one line
                String row = scanner.nextLine();
                
                //Print the line that was read 
                System.out.println(row);
            }     
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
 
    }
}