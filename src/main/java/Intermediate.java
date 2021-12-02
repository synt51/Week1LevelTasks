import java.util.Arrays;
import java.util.Scanner;

public class Intermediate {

    public static Scanner scanner = new Scanner(System.in);

    public static String userInput() {
        return scanner.nextLine();
    }
    public static int numInput() {
        return scanner.nextInt();
    }
    // Array der Zahlen 1 - 10 ausgeschrieben
    public static String[] numbersInWord = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};

    public static void main(String[] args) {

        System.out.println("Hey, willst du wissen, wie man die Zahlen 1 - 10 ausschreibt?");
        System.out.println("Nenne mir eine dieser Zahlen und bestätige Sie mit ENTER :)");
        int num = numInput();
        System.out.println(num + " ausgeschrieben ist: " + numbersInWord[num - 1] + ".");
        System.out.println("");
        if (num % 3 == 0){
            System.out.println("Deine Zahl ist durch 3 teilbar.");
        } else if (num % 5 == 0){
            System.out.println("Deine Zahl ist durch 5 teilbar.");
        } else {
            System.out.println("Deine Zahl ist weder durch 3, noch durch 5 teilbar.");
        }
        System.out.println("Aber ich kann dir auch zeigen, welche Zahlen zwischen 1 und 100 durch 3 oder 5 teilbar sind.");

        for(int i =1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("#$" + i);
            } else if (i % 3 == 0){
                System.out.println("#" + i);
            } else if (i % 5 == 0){
                System.out.println("$" + i);
            } else {
                System.out.println(i);
            }
        }
    }
}