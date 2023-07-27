package p3_basic_functions;

public class c1_strings {

    public static void main(String[] args) {

        String greeting;

        greeting = "Hello";
        greeting = greeting + " World";
        greeting = greeting.concat("!");

        System.out.println(greeting);
        System.out.println(greeting.length());
        System.out.println(greeting.toLowerCase());
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.substring(4, 10));
        System.out.println(greeting.charAt(2));

    }
}
