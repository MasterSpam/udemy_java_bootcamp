package p3_basic_functions;

public class c3_mathematical_functions {

    public static void main(String[] args) {

        // Betrag berechnen:
        System.out.println(Math.abs(-10));

        // Aufrunden:
        System.out.println(Math.ceil(9.5));

        // Abrunden:
        System.out.println(Math.floor(9.5));

        // Runden:
        System.out.println(Math.round(9.4));

        // Minimum:
        System.out.println(Math.min(1, 6));

        // Maximum:
        System.out.println(Math.max(1, 6));

        // Logarithmus:
        System.out.println(Math.log(6));

        // 2 hoch 10 berechnen
        System.out.println(Math.pow(2, 10));

        // Zufallszahl generieren (random -> 0-1)
        System.out.println(Math.random() * 5);

        long a = 123;
        a += 2;
        System.out.println(a);

        a++;
        System.out.println(a);

        a--;
        System.out.println(a);

    }

}
