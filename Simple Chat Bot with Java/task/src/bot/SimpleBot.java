package bot;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Scanner object for user input

    public static void main(String[] args) {
        greet("Aid", "2018"); // Greet the user and introduce the bot
        remindName(); // Prompt the user to enter their name
        guessAge(); // Guess the user's age based on remainders
        count(); // Count to a number entered by the user
        test(); // Ask a programming knowledge question
        end(); // Display a congratulatory message
    }

    // Greet the user and introduce the bot
    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    // Prompt the user to enter their name and display a greeting
    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    // Guess the user's age based on remainders
    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5, and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    // Count to a number entered by the user
    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    // Ask a programming knowledge question and validate the answer
    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        int option;

        // Get the user's answer
        option = scanner.nextInt();

        // Validate the answer
        if (option != 2) {
            do {
                System.out.println("Please, try again.");
                option = scanner.nextInt();
            } while (option != 2);
        }
    }

    // Display a congratulatory message
    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Final message
    }
}
