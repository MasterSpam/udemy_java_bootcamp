package p1_coding_exercises;

public class Ex_7_last_word_in_string {

    public static void main(String[] args) {

        String input = "Ich heisse Moritz";

        // Die Variable input existiert bereits. Gebe jetzt mit einem
        // System.out.println() das letzte Wort eines Strings aus.
        // Beispiel:
        // Bei der Eingabe "Hallo Welt und Mars" soll "Mars" ausgegeben werden,
        // da "Mars" das letzte Wort im String ist.
        String[] words = input.split(" ");
        String lastWord = words[words.length - 1];
        System.out.println(lastWord);
    }
}
