/*
In this exercise, we'll be working with files stored in CSV-format that contain names 
and ages separated by commas. 
 
Your task is to write a program that first prompts the user for the name of the file 
they want to read. 
 
Output:
Name of the file:
data.txt
lily, age: 3 years
anton, age: 5 years
levi, age: 4 years
amy, age: 1 year
*/
import java.nio.file.Paths;
import java.util.Scanner;
 
public class RecordsFromAFile {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try(Scanner reader = new Scanner(Paths.get(file))){
            while(reader.hasNextLine()){
                String input = reader.nextLine();
                
                String[] parts = input.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                
                System.out.println(name + ", " + "age: " + age + " years");
            }
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
 
    }
}