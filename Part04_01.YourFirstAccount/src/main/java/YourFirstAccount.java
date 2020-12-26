/*
Write a program that creates an account with a balance of 100.0, deposits 20.0 in it, 
and finally prints the balance. 
*/
public class YourFirstAccount {
 
    public static void main(String[] args) {
        
        //This task creates a new object of account type.
        Account myAccount = new Account("My account", 100.00);
        
        myAccount.deposit(20.0);
        System.out.println(myAccount);
    }
}
 