package p1_coding_exercises;

import java.util.Scanner;

public class Ex_3_input_with_scanner {

    public static void main(String[] args) {
        String firstName;
        String lastName;

        Scanner input = new Scanner(System.in);

        System.out.println("Bitte gebe deinen Vornamen ein:");
        firstName = input.next();

        System.out.println("Bitte gebe deinen Nachnamen ein:");
        lastName = input.next();

        // Hier Willkommens-Nachricht ausgeben.
        // Beispielsweise soll für Max Mustermann ausgegeben werden:
        // Welcome, Max Mustermann

        System.out.println("Welcome, " + firstName + " " + lastName);

    }
}
