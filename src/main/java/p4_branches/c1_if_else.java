package p4_branches;

import java.util.Scanner;

public class c1_if_else {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        if (x > 10) {
            System.out.println("X ist grösser als 10");
        } else if (x > 5) {
            System.out.println("X ist grösser als 5");
        } else {
            System.out.println("X ist kleiner als 5");
        }

        System.out.println("Fertig");

    }
}
