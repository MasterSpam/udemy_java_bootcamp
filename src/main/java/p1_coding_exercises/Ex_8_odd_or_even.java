package p1_coding_exercises;

public class Ex_8_odd_or_even {

    public static void main(String[] args) {

        // Die Variable int input existiert bereits.
        // Schreibe ein Programm, welches bei einer geraden Zahl das Wort "gerade" ausgibt,
        // bzw. bei einer ungeraden Zahl das Wort "ungerade".
        // Die Ausgabe soll mit Hilfe eines System.out.println() erfolgen.

        int input = 2;
        if (input % 2 == 0) {
            System.out.println("gerade");
        } else {
            System.out.println("ungerade");
        }

    }
}
