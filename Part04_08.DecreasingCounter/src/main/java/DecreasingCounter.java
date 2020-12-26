/*
This exercise consists of multiple parts. 
 
Part 1: Implementation of the decrement() method
 
Implement the decrement() method in the class body in such a way that it decrements 
the value variable of the object it's being called on by one.
 
Output:
value: 10
value: 9
value: 8
 
Part 2: The counter's value cannot be negatives
 
Implement the decrement() in such a way that the counter's value never becomes negative. 
This means that if the value of the counter is 0, it cannot be decremented. A conditional 
statement is useful here.
 
Output:
value: 2
value: 1
value: 0
value: 0
 
Part 3: Resetting the counter value
 
Create the method public void reset() for the counter that resets the value of the counter 
to 0. 
 
Output:
value: 100
value: 0
value: 0
*/
public class DecreasingCounter {
 
    private int value;  // an object variable for storing the value of the counter
 
    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }
 
    public void printValue() {
        // Do not change this code!
        System.out.println("value: " + this.value);
    }
 
    public void decrement() {
        if(this.value > 0){
            this.value--;
        }
    }
 
    public void reset(){
        this.value = 0;
    }
}