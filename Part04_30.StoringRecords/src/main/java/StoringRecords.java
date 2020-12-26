/*
The exercise template already has a Person class, and the class StoringRecords has 
a body for the method public static ArrayList<Person> readRecordsFromFile(String file). 
Implement the readRecordsFromFile method such that it reads the persons from the file 
passed as a parameter, and finally returns them in the list returned by the method.
 
The exercise template has a main method that you can use to test how your program 
works. In this exercise, only modify the method readRecordsFromFile.
*/
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
 
public class StoringRecords {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        System.out.println("Filename:");
        String file = scan.nextLine();
 
        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);
 
        }
    }
 
    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
 
        try(Scanner reader = new Scanner(Paths.get(file))){
            while(reader.hasNextLine()){
                String input = reader.nextLine();
                
                String[] parts = input.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                persons.add(new Person(name,age));
            }
            
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return persons;
 
    }
}
 