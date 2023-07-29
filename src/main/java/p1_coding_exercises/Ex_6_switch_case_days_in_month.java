package p1_coding_exercises;

import java.util.Scanner;

public class Ex_6_switch_case_days_in_month {
    public static void main(String[] args) {
        // String input existiert bereits.
        // Vervollständige das Programm, sodass zu jedem Monat die
        // korrekte Anzahl an Tagen ausgegeben wird. Verwende dazu
        // ein switch-Statement!
        Scanner scanner = new Scanner(System.in);

        String my_month = scanner.next();

//        switch (my_month) {
//            case "Februar" -> System.out.println(28);
//            case "April", "Juni", "September", "November" -> System.out.println(30);
//            default -> System.out.println(31);
//        }

        // auch möglich:
        switch (my_month) {
            case "Februar":
                System.out.println(28);
                break;
            case "April":
            case "Juni":
            case "September":
            case "November":
                System.out.println(30);
                break;
            default:
                System.out.println(31);
        }
    }
}
