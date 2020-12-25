/*
Create the method public static void printNumbersInRange(ArrayList<Integer> numbers, 
int lowerLimit, int upperLimit) in the exercise template. The method prints the numbers 
in the given list whose values are in the range [lowerLimit, upperLimit]. 
 
Output:
The numbers in the range [0, 5]
3
2
5
1
*/
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 0, 5);
    }

    //This task displays the numbers on the list that fall within the specified range.
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){

        for(int i=0; i < numbers.size(); i++){
            if(numbers.get(i) >= lowerLimit && numbers.get(i) <= upperLimit)
                System.out.println(numbers.get(i));
        }

    }

}