public class Task2 {
    public static void main(String[] args) {
        int n = 725;

        int first = n / 100;
        int second = (n / 10) % 10;
        int third = n % 10;

        int max = first;

        if (second > max) {
            max = second;
        }
        if (third > max) {
            max = third;
        }

        System.out.println("Найбільша цифра: " + max);
    }
}
