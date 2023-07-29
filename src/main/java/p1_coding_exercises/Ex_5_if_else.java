package p1_coding_exercises;
//Negativ , wenn die Zahl kleiner als 0 ist
//Positiv , wenn die Zahl größer als 0 ist.
//Neutral , wenn die Zahl 0 übergeben wird.

public class Ex_5_if_else {

    public static void main(String[] args) {
        int my_num;

        my_num = 5;

        if(my_num > 0) {
            System.out.println("Positiv");
        } else if(my_num < 0) {
            System.out.println("Negativ");
        } else {
            System.out.println("Neutral");
        }
    }
}
