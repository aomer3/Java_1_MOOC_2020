/*
Define a two-parameter method smallest that returns the smaller of the two numbers passed to it as parameters.

The output of the program:
Smallest: 2
 */
public class Smallest {

    // This task determines the smallest of the two numbers entered by the user.
    public static int smallest(int number1, int number2) {
        if(number1 < number2){
            return number1;
        } else {
            return number2;
        }

    }

    // This task displays the smallest number entered by the user.
    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}
