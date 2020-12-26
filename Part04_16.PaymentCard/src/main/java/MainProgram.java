/*
At the University of Helsinki student canteen, i.e. Unicafe, students pay for their 
lunch using a payment card. In this exercise series, a class called PaymentCard is 
created which aims to mimic Unicafe's payment process.
 
Part 1: The class template
The project will include two code files: 
 
The exercise template comes with a code file called Main, which contains the main 
method. Add a new class to the project called PaymentCard. First, create the PaymentCard 
object's constructor, which is passed the opening balance of the card, and which then 
stores that balance in the object's internal variable. Then, write the toString method, 
which will return the card's balance in the form "The card has a balance of X euros".
 
Output:
The card has a balance of 50.0 euros
 
Part 2: Making transactions
Complement the PaymentCard class with the following methods. The method eatAffordably 
should reduce the card's balance by € 2.60, and the method eatHeartily should reduce 
the card's balance by € 4.60.
 
Output(User enters starting balance os 50, eats affordably, then eats heartily once,
then eats affordably again):
The card has a balance of 50.0 euros
The card has a balance of 47.4 euros
The card has a balance of 40.199999999999996 euros
 
Part 3: Non-negative balance
What happens if the card runs out of money? It doesn't make sense in this case for 
the balance to turn negative. Change the methods eatAffordably and eatHeartily so 
that they don't reduce the balance should it turn negative.
 
Output(User enters starting balance of 5, eats heartily, then eats heartily again);
The card has a balance 5.0 euros
The card has a balance 0.40000000000000036 euros
The card has a balance 0.40000000000000036 euros
 
Part 4: Topping up the card
Add the following method to the PaymentCard class, addMoney. The purpose of the 
method is to increase the card's balance by the amount of money given as a parameter. 
However, the card's balance may not exceed 150 euros. As such, if the amount to be 
topped up exceeds this limit, the balance should, in any case, become exactly 150 euros.
 
Output(user enters starting balance of 10, adds 15 euros, then adds 10 euros, then adds 200 euros):
The card has a balance of 10.0 euros
The card has a balance of 25.0 euros
The card has a balance of 35.0 euros
The card has a balance of 150.0 euros
 
Part 5: Topping up the card with a negative value
Change the addMoney method further, so that if there is an attempt to top it up with a 
negative amount, the value on the card will not change.
 
Output(user enters starting balance of 10, then adds -15 euros):
Paul: The card has a balance of 10.0 euros
Paul: The card has a balance of 10.0 euros
 
Part 6: Multiple cards
Write code in the main method of the MainProgram class that contains the following 
sequence of events:
 
Create Paul's card. The opening balance of the card is 20 euros
Create Matt's card. The opening balance of the card is 30 euros
Paul eats heartily
Matt eats affordably
The cards' values ​​are printed (each on its own line, with the cardholder name at 
the beginning of it)
Paul tops up 20 euros
Matt eats heartily
The cards' values ​​are printed (each on its own line, with the cardholder name at 
the beginning of it)
Paul eats affordably
Paul eats affordably
Matt tops up 50 euros
The cards' values ​​are printed (each on its own line, with the cardholder name at 
the beginning of it)
 
Output:
Paul: The card has a balance of 15.4 euros
Matt: The card has a balance of 27.4 euros
Paul: The card has a balance of 35.4 euros
Matt: The card has a balance of 22.799999999999997 euros
Paul: The card has a balance of 30.199999999999996 euros
Matt: The card has a balance of 72.8 euros
*/
public class MainProgram {
 
    public static void main(String[] args) {
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);
        
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
        
        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
        
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
    }
}