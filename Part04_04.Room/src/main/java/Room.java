/*
Create a class named Room. Add the variables private String code and private int 
seats to the class. Then create a constructor public Room(String classCode, int numberOfSeats) 
through which values are assigned to the instance variables.
 */
public class Room {
    
    //These are the instance variables for the Room class
    private String code;
    private int seats;
    
    //This is the constructor for the Room class
    public Room(String classCode, int numberOfSeats){
        this.code = classCode;
        this.seats = numberOfSeats;
    }
           
    
}