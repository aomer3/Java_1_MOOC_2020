/*
Write a program that reads strings from the user until the user inputs the string 
"end". At that point, the program should print how many strings have been read. 
The string "end" should not be included in the number strings read. You can find 
some examples below of how the program works.
 
User entry:
I
have
a
feeling
that
I
have
written
this
wrong
before
end
 
Output:
11
 
User entry:
end
 
Output:
0
*/
import java.util.Scanner;
 
public class NumberOfStrings {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count=0;
        
        while(true){
            String input = scanner.nextLine();
            
            if(input.equals("end")){
                break;
            }
            
            count++;
        }
        
        System.out.println(count);
    }
}