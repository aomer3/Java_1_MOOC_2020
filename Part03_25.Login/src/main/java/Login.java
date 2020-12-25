/*
Write a program that recognizes the following users:
 
username            password
alex                sunshine
emma                haskell
 
Output:
Enter username: alex
Enter password: sunshine
You have successfully logged in!
 
 
Output:
Enter username: alex
Enter password: thunderstorm
Incorrect username or password!
*/
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = {"alex","emma"};
        String[] passwords = {"sunshine","haskell"};

        System.out.println("Enter username: ");
        String username = scanner.nextLine();

        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        int index = 0;
        boolean checkName = false;
        boolean checkPass = false;

        //This task checks if the entered username is valid.
        for(int i=0; i < usernames.length; i++){
            if(username.equals(usernames[i])){
                checkName = true;
                index = i;
            }
        }

        //This task checks if the entered password matches the username.
        if(checkName = true && password.equals(passwords[index])){
            checkPass = true;
        }

        if(!(checkName == true) || !(checkPass = true)){
            System.out.println("Incorrect username or password!");
        } else{
            System.out.println("You have successfully logged in!");
        }
    }
}