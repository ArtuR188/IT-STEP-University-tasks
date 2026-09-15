class Task235 {
    public static void main(String[] args) {
        int count = 0;
        for (int h = 0; h < 24; h++)
            for (int m = 0; m < 60; m++)
                if (h / 10 == m % 10 && h % 10 == m / 10) count++;
        System.out.println("Symetrical combinations: " + count);
    }
}
