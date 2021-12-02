import java.util.Scanner;

public class Novice {

    public static Scanner scanner = new Scanner(System.in);

    public static String userInput() {
        return scanner.nextLine();
    }
    public static int numInput() {
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("Hallo, mein Name ist Deep Thought. Wie ist dein Name?");
        String name = userInput();
        System.out.println(name + " ist ein schöner Name.");
        for (int i = 0; i < 5; ++i) {
            System.out.println(name);
        }
        System.out.println("Nenne mir eine Zahl und ich kann dir sagen, ob die Zahl durch 5 oder durch 3 teilbar ist.");
        int num = numInput();
        if (num % 3 == 0){
            System.out.println("Deine Zahl ist durch 3 teilbar.");
        } else if (num % 5 == 0){
            System.out.println("Deine Zahl ist durch 5 teilbar.");
        } else {
            System.out.println("Deine Zahl ist weder durch 3, noch durch 5 teilbar.");
        }
        System.out.println("Wenn ich dir noch eine Zahl zum Quadrat berechnen soll, tippe diese ein. :)");
        int numTwo = numInput();
        if (numTwo > 0 || numTwo < 0){
            System.out.println("Deine Zahl zum Quadrat ist: " + (numTwo*numTwo));
        }else{
            System.out.println("Deine Zahl ist entweder 0, was zum Quadrat 0 ist, oder ist zu groß für mich.");
        }
        System.out.println("Mach's gut! :)");
    }
}

