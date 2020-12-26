/*
Create a class called Song. The song has the instance variables name (string) and 
length in seconds (integer). Both are set in the public Song(String name, int length) 
constructor. Also, add to the object the methods public String name(), which returns 
the name of the song, and public int length(), which returns the length of the song.
 
The class should work as follows.
 
Song garden = new Song("In The Garden", 10910);
System.out.println("The song " + garden.name() + " has a length of " + garden.length() + " seconds.");
 
Output:
The song In The Garden has a length of 10910 seconds.
 */
public class Song {
    private String name;
    private int length; //in seconds
    
    public Song(String name, int length){
        this.name = name;
        this.length = length;
    }
    
    public String name(){
        return name;
    }
    
    public int length(){
        return length;
    }
}