import java.util.Arrays;
import java.util.Scanner;

public class Intermediate {

    public static void print(String what) {
        System.out.println(what);
    }

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

    // Methoden
    public static void initConversation() {
        print("Hey, willst du wissen, wie man die Zahlen 1 - 10 ausschreibt?");
        print("Nenne mir eine dieser Zahlen und bestätige Sie mit ENTER :)");
        int num = numInput();
        print(num + " ausgeschrieben ist: " + numbersInWord[num - 1] + ".");
        if (num % 3 == 0) {
            print("Deine Zahl ist durch 3 teilbar.");
        } else if (num % 5 == 0) {
            print("Deine Zahl ist durch 5 teilbar.");
        } else {
            print("Deine Zahl ist weder durch 3, noch durch 5 teilbar.");
        }
    }

    public static void listDivisibleByThreeOrFive() {
        print("Aber ich kann dir auch zeigen, welche Zahlen alles zwischen 1 und 100 durch 3 oder 5 teilbar sind.");
        System.out.println("Hier die Liste:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                print("#$" + i);
            } else if (i % 3 == 0) {
                print("#" + i);
            } else if (i % 5 == 0) {
                print("$" + i);
            } else {
                print("" + i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        initConversation();
        listDivisibleByThreeOrFive();
        print("Soll ich bestimmte Wörter für dich speichern? Tippe y für ja, oder n für nein. :)");
        Thread.sleep(500);
        String yn = userInput();
        if (yn.equalsIgnoreCase("y")) {
            print("Welche Wörter soll ich speichern? :)");
        } else if (yn.equalsIgnoreCase("n")) {
            print("Alles klar, dann bis zum nächsten Mal! :)");
            System.exit(0);
        } else {
            print("Etwas ist schief gelaufen... Starte das Programm bitte neu :(");
            System.exit(0);
        }
//        String whichWord = userInput();
//
//        while (!whichWord.equalsIgnoreCase("exit")){
//            whichWord = "";
//            System.out.println("Ok, " + whichWord + " wurde gespeichert. Welches Wort noch?");
//            if (whichWord.equalsIgnoreCase("exit")){
//                System.exit(0);
//            }
//        }
//        System.out.println("Test ob es weiter geht.");
    }
}