package p4_branches;

import java.util.Scanner;

public class c2_switch_case {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        switch (x) {
            case 11, 10 -> System.out.println("X ist 10 oder 11");
            case 9 -> System.out.println("X ist 9");
            default -> System.out.println("Default");
        }

        System.out.println("Fertig!");
    }
}
