/*
Create a class named Door. The door does not have any variables. Create for it a 
constructor with no parameters (or use the default constructor). After that, create 
a public void knock() method for the door that prints the message "Who's there?" when 
called.
 
The door should work as follows.
 
Door alexander = new Door();
 
alexander.knock();
alexander.knock();
 
Output:
Who's there?
Who's there?
*/
public class Main {
 
    public static void main(String[] args) {
        Door alexander = new Door();
        
        alexander.knock();
        alexander.knock();
    }
}