class Task234 {
    public static void main(String[] args) {
        int n = 10, fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        System.out.println(n + "! = " + fact);

        int j = 1, factWhile = 1;
        while (j <= n) factWhile *= j++;
        System.out.println(n + "! (while) = " + factWhile);
    }
}
