/*
Create the following method in the exercise template: public static void printFromNumberToOne(int number). It should
print the numbers from the number passed as a parameter down to one.

Output (if user enters 5):
5
4
3
2
1
 */

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);

    }

    //This task displays a sequene of numbers, from the number entered by the user to 1.
    public static void printFromNumberToOne(int number){
        int i = 1;

        while(number >= i){
            System.out.println(number);
            number--;
        }
    }

}

