/*
The exercise template contains a program that prints the following:
Chicken:
3
Bacon (kg):
5.5
Tractor:
None!

And finally, a summary:
3
5.5
None!
 */

public class VariousVariables {

    public static void main(String[] args) {
        // MODIFY THESE
        int numberOfChicken = 9000;
        double baconWeight = 0.1;
        String tractor = "Zetor";

        // DON'T MODIFY THESE:
        //These tasks output messages onto the screen, using the created variables.
        System.out.println("Chicken:");
        System.out.println(numberOfChicken);
        System.out.println("Bacon (kg):");
        System.out.println(baconWeight);
        System.out.println("Tractor:");
        System.out.println(tractor);
        System.out.println("");
        System.out.println("And finally, a summary:");
        System.out.println(numberOfChicken);
        System.out.println(baconWeight);
        System.out.println(tractor);
    }
}
