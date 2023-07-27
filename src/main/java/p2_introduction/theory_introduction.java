package p2_introduction;

public class theory_introduction {

    public static void main(String[] args) {

        // gross weil zusammengesetzter Datentyp
        String greeting;
        greeting = "Hallo Welt";

        // klein weil primitiver Datentyp
        long my_num = 50;
        double your_num = 30;
        long result;
        char my_letter = 'g' + 'o'; // ASCII Wert addiert => Ö
        boolean my_boolean;

        result = my_num / 2;
        your_num = your_num / 7;
        my_boolean = 150 > 100;

        System.out.println(greeting);
        System.out.println(result);
        System.out.println(your_num);
        System.out.println(my_letter);
        System.out.println(my_boolean);
    }
}
