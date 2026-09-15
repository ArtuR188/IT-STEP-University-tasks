import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    // task 1: Масив непарних чисел від 1 до 99
    static void task1() {
        int[] array = new int[50];
        for (int i = 0, num = 1; i < 50; i++, num += 2) {
            array[i] = num;
        }
        printArray(array);
    }

    // task 2: Масив з 20 випадкових чисел та заміна непарних індексів на 0
    static void task2() {
        Random rand = new Random();
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = rand.nextInt(10);
        }
        printArray(array);
        for (int i = 1; i < 20; i += 2) {
            array[i] = 0;
        }
        printArray(array);
    }

    // task 3: Порівняння середніх значень трьох масивів
    static void task3() {
        Random rand = new Random();
        int[][] arrays = new int[3][5];
        double[] avg = new double[3];
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                arrays[i][j] = rand.nextInt(6);
                sum += arrays[i][j];
            }
            avg[i] = sum / 5.0;
            printArray(arrays[i]);
        }
        System.out.println("Найбільше середнє значення: " + maxIndex(avg));
    }

    // task 4: Два масиви + сумування елементів у третій масив
    static void task4() {
        Random rand = new Random();
        int[] array1 = new int[10], array2 = new int[10], sumArray = new int[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = rand.nextInt(11);
            array2[i] = rand.nextInt(11);
            sumArray[i] = array1[i] + array2[i];
        }
        printArray(array1);
        printArray(array2);
        printArray(sumArray);
    }

    // task 5: Масив з 15 випадкових чисел, підрахунок парних
    static void task5() {
        Random rand = new Random();
        int[] array = new int[15];
        int count = 0;
        for (int i = 0; i < 15; i++) {
            array[i] = rand.nextInt(11);
            if (array[i] % 2 == 0) count++;
        }
        printArray(array);
        System.out.println("Кількість парних елементів: " + count);
    }

    // task 6: Двовимірний масив різної довжини рядків
    static void task6() {
        Random rand = new Random();
        int[][] array = new int[15][];
        for (int i = 0; i < 15; i++) {
            int cols = (i < 4) ? 5 : (i < 8) ? 8 : (i < 12) ? 3 : 9;
            array[i] = new int[cols];
            for (int j = 0; j < cols; j++) {
                array[i][j] = rand.nextInt(16);
            }
            printArray(array[i]);
        }
    }

    // Допоміжні методи
    static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static int maxIndex(double[] array) {
        int maxIdx = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIdx]) maxIdx = i;
        }
        return maxIdx;
    }
}
