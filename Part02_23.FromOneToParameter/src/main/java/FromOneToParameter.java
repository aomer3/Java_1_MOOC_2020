/*
Create the following method in the exercise template: public static void printUntilNumber(int number). It should print
the numbers from one to the number passed as a parameter.

Output (if user enters 5):
1
2
3
4
5
 */
public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
        printUntilNumber(2);
    }

    //This tasks displays a sequence of numbers, from 1 to the number entered by the user.
    public static void printUntilNumber(int number){
        int i= 1;

        while(i <= number){
            System.out.println(i);
            i++;
        }

    }

}