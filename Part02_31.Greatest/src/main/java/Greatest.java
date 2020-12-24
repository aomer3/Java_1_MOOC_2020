/*
Define a method called greatest that takes three numbers and returns the greatest of them. If there are multiple
greatest values, returning one of them is enough. Printing will take place in the main program.

The output of the program:
Greatest: 7
 */
public class Greatest {

    //This task determines the greatest number entered by the user.
    public static int greatest(int number1, int number2, int number3) {
        if(number1 >= number2 && number1 >= number3){
            return number1;
        }
        if(number2 >= number1 && number2 >= number3){
            return number2;
        }
        return number3;
    }

    //This task displays the greatest number entered by the user.
    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}