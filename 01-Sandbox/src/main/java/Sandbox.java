//Boilerplate code
//Program Name is Sandbox, matches filename "Example.java"

import java.util.Scanner; //Need to import the scanner tool to read input

public class Sandbox {

    public static void main(String[] args) {
        // Write your program here
        //Ctrl + D to duplicate lines
        System.out.println("Once upon a time");
        System.out.println("there was");
        System.out.println("a program\n");

        //Construct a scanner
        //Reading strings
        /////////////////
        Scanner scanner = new Scanner(System.in);
        System.out.println("Getting string input");
        System.out.println("Enter your name: ");

        //Get input with nextLine method assign to name of String type
        String name = scanner.nextLine();

        //Print name
        System.out.println("You entered " + name);

        //Concatenate strings - Similar to JavaScript
        System.out.println(name + " Dong is your full name");

        int number = 5;

        //Similarly, you can print different data types just by concatenating
        System.out.println(name + " is " + number + " years old.\n");

        /*Other input types, such as integers, doubles, and booleans are also read as text.
        However, they need to be converted to the target variable's type with the help of some tools provided by Java.
        */

        //Reading values
        ////////////////

        //Method 1 - Parse an integer from a string
        // - Consumes \n so buffer is clear

        //scanner.nextLine is used to read in strings
        //Integer.valueOf extracts the integer from that string
        System.out.println("Getting integer input");
        System.out.println("Enter a number: ");
        int value = Integer.valueOf((scanner.nextLine()));
        System.out.println("You entered: " + value + "\n");

        //Method 2 - Read an int directly
        // - Leaves \n in the buffer
        // - Skips leading whitespace
        System.out.println("Enter another number: ");
        value = scanner.nextInt();
        System.out.println("You entered " + value + "\n");

        //Reading boolean
        /////////////////

        //Notice how newline was left in the buffer and the  next scanner doesn't wait for us
        //Clear buffer
        scanner.nextLine();

        //Anything other than true (case-insensitive) is false
        System.out.println("Enter true or false: ");
        boolean torf = Boolean.valueOf(scanner.nextLine());
        System.out.println(torf + " was evaluated");

        //Conditional expressions and comparing string method
        /////////////////////////////////////////////////////
        System.out.println("Enter a string");
        String input = scanner.nextLine();

        //String method!
        if (input.equals("a string")) {
            System.out.println("Great! You read the instructions correctly.");
        } else {
            System.out.println("Missed the mark!");
        }

    }
}
