class Task233 {
    public static void main(String[] args) {
        int number = 10;
        System.out.print("dividers " + number + ": ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) System.out.print(i + " ");
        }
    }
}
