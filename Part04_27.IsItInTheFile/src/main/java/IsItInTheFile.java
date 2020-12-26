/*
The exercise template comes with two files, names.txt and other-names.txt. Write a 
program that first asks the user for the name of the file to be read, after which 
the user is prompted for the string that they're looking for. The program then reads 
the file and searches for the desired string.
 
If the string is found, the program should print "Found!". If not, the program should 
print "Not found.". If reading the file fails (the reading ends in an error) the program 
should print the message "Reading the file " + file + " failed.".
 
Output:
Name of the file:
names.txt
Search for:
Antti
Not found.
 
Output:
Name of the file:
names.txt
Search for:
ada
Found!
 
Output:
Name of the file:
nonexistent.txt
Search for:
test
Reading the file nonexistent.txt failed.
*/
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;
 
public class IsItInTheFile {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> list = new ArrayList<>();
                
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
 
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
                        
        try(Scanner reader = new Scanner(Paths.get(file))){
            while(reader.hasNextLine()){
                list.add(reader.nextLine());
            }
            
            if(list.contains(searchedFor)){
                System.out.println("Found!");
            } else{
                System.out.println("Not found.");
            }
            
        }
        catch(Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
 
    }
}
 