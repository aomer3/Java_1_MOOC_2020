/*
The table below describes how the grade for a particular course is determined. Write a program that gives a course
grade according to the provided table.

points	grade
< 0	    impossible!
0-49	failed
50-59	1
60-69	2
70-79	3
80-89	4
90-100	5
> 100	incredible!

Give points [0-100]:
37
Grade: failed

Give points [0-100]:
95
Grade: 5
 */
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //This tasks asks the user to enter a grade, betweem 0 and 100, then stores the user input.
        System.out.println("Give points [0-100]:");
        int value = Integer.valueOf(scan.nextLine());

        //This task determines the grade and displays a message onto the screen. 
        if(value < 0 ) {
            System.out.println("Grade: Impossible!");
        } else if (value < 50 ) {
            System.out.println("Grade: failed");
        } else if (value < 60) {
            System.out.println("Grade: 1");
        } else if (value < 70) {
            System.out.println("Grade: 2");
        } else if (value < 80) {
            System.out.println("Grade: 3");
        } else if (value < 90) {
            System.out.println("Grade: 4");
        } else if (value <= 100) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade: incredible!");
        }

    }
}
