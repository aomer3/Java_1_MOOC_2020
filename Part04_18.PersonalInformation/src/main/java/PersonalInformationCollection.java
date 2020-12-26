/*
After the user has entered the last set of details (they enter an empty first name), 
exit the repeat statement.
 
Then print the collected personal information so that each entered object is printed 
in the following format: first and last names separated by a space (you don't print 
the identification number). 
 
Output:
First name: Jean
Last name: Bartik
Identification number: 271224
First name: Betty
Last name: Holberton
Identification number: 070317
First name:
 
Jean Bartik
Betty Holberton
*/
import java.util.ArrayList;
import java.util.Scanner;
 
public class PersonalInformationCollection {
 
    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class
 
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("First name: ");
            String nameFirst = scanner.nextLine();
            
            if(nameFirst.isEmpty()){
                break;
            }
            
            System.out.print("Last name: ");
            String nameLast = scanner.nextLine();
            
            System.out.print("Identification number: ");
            String idNumber = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(nameFirst, nameLast, idNumber));
        }
        
        System.out.println();
        
        for(PersonalInformation pi: infoCollection){
            System.out.println(pi.getFirstName() + " " + pi.getLastName());
        }
 
    }
}