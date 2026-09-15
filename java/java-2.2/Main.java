import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть відповідь (Так/ОК/Yes/Y/+ або Ні/No/N/-): ");
        String response = scanner.next().trim(); // Видаляємо зайві пробіли

        if (response.equalsIgnoreCase("так") || response.equalsIgnoreCase("ок") ||
                response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y") ||
                response.equals("+")) {
            System.out.println("Я погоджуюсь!");
        } else if (response.equalsIgnoreCase("ні") || response.equalsIgnoreCase("no") ||
                response.equalsIgnoreCase("n") || response.equals("-")) {
            System.out.println("Я відмовляюсь!");
        } else {
            System.out.println("Невірне значення!");
        }

        scanner.close();
    }
}
