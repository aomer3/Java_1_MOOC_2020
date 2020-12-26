/*
Write a program that:
 
1. Creates an account named "Matthews account" with the balance 1000
2. Creates an account named "My account" with the balance 0
3. Withdraws 100.0 from Matthew's account
4. Deposits 100.0 to "my account"
5. Prints both the accounts
*/
public class YourFirstBankTransfer {
 
    public static void main(String[] args) {
        
        //This task creates two objects of type account.
        Account matthewsAccount = new Account("Matthews account", 1000.00);
        Account myAccount = new Account("My account", 0);
        
        matthewsAccount.withdrawal(100.00);
        myAccount.deposit(100.00);
        
        System.out.println(matthewsAccount);
        System.out.println(myAccount);
    }
}
 