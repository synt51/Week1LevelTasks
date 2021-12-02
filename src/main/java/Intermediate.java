import java.util.Arrays;
import java.util.Scanner;

public class Intermediate {

    public static int numInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String userInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    // Array der Zahlen 1 - 10 ausgeschrieben
    public static String[] numbersInWord = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hey, willst du wissen, wie man die Zahlen 1 - 10 ausschreibt?");
        System.out.println("Nenne mir eine dieser Zahlen und bestätige Sie mit ENTER :)");
        int num = numInput();
        System.out.println(num + " ausgeschrieben ist: " + numbersInWord[num - 1] + ".");
        if (num % 3 == 0) {
            System.out.println("Deine Zahl ist durch 3 teilbar.");
        } else if (num % 5 == 0) {
            System.out.println("Deine Zahl ist durch 5 teilbar.");
        } else {
            System.out.println("Deine Zahl ist weder durch 3, noch durch 5 teilbar.");
        }
        System.out.println("");
        System.out.println("Aber ich kann dir auch zeigen, welche Zahlen alles zwischen 1 und 100 durch 3 oder 5 teilbar sind.");
        System.out.println("Hier die Liste:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("#$" + i);
            } else if (i % 3 == 0) {
                System.out.println("#" + i);
            } else if (i % 5 == 0) {
                System.out.println("$" + i);
            } else {
                System.out.println(i);
            }
        }
        System.out.println("");
        System.out.println("Soll ich bestimmte Wörter für dich speichern? Tippe y für ja, oder n für nein. :)");
        Thread.sleep(500);
        String yn = userInput();
        if (yn.equalsIgnoreCase("y")) {
            System.out.println("Welche Wörter soll ich speichern? :)");
        } else if (yn.equalsIgnoreCase("n")) {
            System.out.println("Alles klar, dann bis zum nächsten Mal! :)");
            System.exit(0);
        } else {
            System.out.println("Etwas ist schief gelaufen... Starte das Programm bitte neu :(");
            System.exit(0);
        }
        String whichWord = userInput();

    }
}