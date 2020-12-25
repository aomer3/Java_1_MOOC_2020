/*
Complete the method public static void printArrayInStars(int[] array) in the class 
named 'Printer' to make it print a row of stars for each number in the array. The 
amount of stars on each row is defined by the corresponding number in the array.
 
Output:
*****
*
***
****
**
 
*/
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    //This task prints a line of stars corresponding with the value in each index of the array.
    public static void printArrayInStars(int[] numbers) {
        for(int i=0; i < numbers.length; i++){
            for(int j=0; j < numbers[i]; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

}