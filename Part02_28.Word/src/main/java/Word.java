/*
Write a method public static String word(). The method must return a string of your choice.
 */
import java.util.Scanner;

public class Word {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(word());

    }

    //This task outputs a message entered by the user.
    public static String word(){
        String word = "Hello there";
        return word;
    }
}

