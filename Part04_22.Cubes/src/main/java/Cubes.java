/*
Write a program that reads strings from the user until the user inputs the string 
"end". As long as the input is not "end", the program should handle the input as 
an integer and print the cube of the number provided (i.e., number _ number _ number).
 
Output:
3      <- user enters number
27     <- the cube of number is printed
-1
1
11
1331
end
 
Output:
end
*/
import java.util.Scanner;
 
public class Cubes {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
         
            String input = scanner.nextLine();
            
            if(input.equals("end")){
                break;
            }
            
            int number = Integer.valueOf(input);
            
            int cube = number * number * number;
            System.out.println(cube);
        }
 
    }
}