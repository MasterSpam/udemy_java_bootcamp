package p3_basic_functions;

import java.util.Scanner;

public class c2_input {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float my_value = input.nextFloat();

        System.out.println(my_value * my_value);

        System.out.println(input.next()); // any value type

    }
}
