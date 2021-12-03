import java.util.ArrayList;
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

        if (num <= 10 && num > 0) {
            print(num + " ausgeschrieben ist: " + numbersInWord[num - 1] + ".");
            if (num % 3 == 0) {
                print("Deine Zahl ist durch 3 teilbar.");
            } else if (num % 5 == 0) {
                print("Deine Zahl ist durch 5 teilbar.");
            } else {
                print("Deine Zahl ist weder durch 3, noch durch 5 teilbar.");
            }
            }else {
            print("Deine Zahl ist nicht zwischen 1 und 10, aber probier es doch nochmal. :)");
        }
    }

    public static void listDivisibleByThreeOrFive() throws InterruptedException {
        print("Aber ich kann dir auch zeigen, welche Zahlen alles zwischen 1 und 100 durch 3 (# vor der Zahl) oder 5 ($ vor der Zahl) teilbar sind.");
        Thread.sleep(5000);
        print("3 :)");
        Thread.sleep(1000);
        print("2 :)");
        Thread.sleep(1000);
        print("1 :)");
        Thread.sleep(1000);
        print("Hier die Liste:");
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

    public static void savingUserWords() {
        Scanner scanner = new Scanner(System.in);
        boolean InputActive = true;
        ArrayList<String> wordsArray = new ArrayList<>();

        print("Soll ich bestimmte Wörter für dich speichern? Tippe y für ja, oder n für nein und bestätige das mit ENTER. :)");
        String yn = userInput();
        if (yn.equalsIgnoreCase("y")) {
            print("Welches Wort soll ich speichern? :)");
        } else if (yn.equalsIgnoreCase("n")) {
            print("Alles klar, dann bis zum nächsten Mal! :)");
            System.exit(0);
        } else {
            print("Etwas ist schief gelaufen... Starte das Programm bitte neu :(");
            System.exit(0);
        }
        while (true) {
            print("Diese Wörter hast du bereits gespeichert:");
            print("" + wordsArray);
            String inputWord = scanner.nextLine();
            wordsArray.add(inputWord);
            print("Willst du ein weiteres Wort bei mir speichern? Tippe wieder y für ja, oder n für nein und bestätige das mit ENTER :)");
            String inputInputActive = scanner.nextLine();
            if (inputInputActive.equals("y")) {
                print("Wie lautet dein nächstes Wort? :)");
            } else if (inputInputActive.equals("n")) {
                print("Also kein weiteres Wort? Ok :(");
                print("Deine gespeicherten Begriffe sind: " + wordsArray);
                break;
            } else {
                print("Etwas ist schief gelaufen... Starte das Programm bitte neu :(");
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        initConversation();
        listDivisibleByThreeOrFive();
        savingUserWords();
    }
}
