/*
The exercise template defines an Agent class, having a first name and last name.
 
Output:
My name is Bond, James Bond
My name is Bond, Ionic Bond
*/
public class Main {
    public static void main(String[] args){
        Agent bond = new Agent("James", "Bond");
        
        bond.toString(); //returns string but is ignored because no variable was created to hold it
        System.out.println(bond);
        
        Agent ionic = new Agent("Ionic", "Bond");
        System.out.println(ionic);
        
    }
}