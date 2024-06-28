
public class Lesson_1 {
    public static void main(String[] args) {
        printThreeWords();
        printColor();
        checkSumSign();

        int number = 0;
        checkNumber(number);

        //решение 5-й задачи
        int num1 = 15;
        int num2 = 12;

        boolean result = checkSumInRange(num1, num2);
        System.out.println("Сумма в пределах от 10 до 20 (включительно): " + result);

        //решение 7-й задачи
        number = 7;
        boolean isNegative = checkIfNegative(number);
        System.out.println("Число " + number + " отрицательное: " + isNegative);

        //решение 8-й задачи
        String text = "I love java!";
        int count = 3;

        printStringMultipleTimes(text, count);

    //решение 9-й задачи
        int year = 2024; // Здесь можно задать любой год
        boolean isLeapYear = checkLeapYear(year);
        System.out.println("Год " + year + " високосный: " + isLeapYear);

    //решение 14-й задачи
        int len = 25;
        int initialValue = 5;

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {

            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }

    //решение 13-й задачи
        int size = 5;
        int[][] matrix = new int[size][size];

        // Заполняем диагональные элементы единицами
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
        }

        // Выводим массив
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    //решение 12-й задачи
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }

        // Выводим измененный массив
        for (int value : array) {
            System.out.print(value + " ");
        }

    //решение 11-й задачи
        array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        // Выводим заполненный массив
        for (int value : array) {
            System.out.print(value + " ");
        }

    //решение 10-й задачи
        array = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }

        }

        // Выводим измененный массив
        for (int value : array) {
            System.out.println(value + " ");
        }
    }

    public static boolean checkLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);


    }

    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public static boolean checkIfNegative(int num) {
        return num < 0;

    }
    //решение 6-й задачи
    private static void checkNumber(int num) {
        if (num >= 0) {
            System.out.println(num + " - положительное число.");
        } else {
            System.out.println(num + " - отрицательное число.");
        }

    }

    //решение 4-й задачи
    private static void checkSumSign() {
        int a = 15;
        int b = -3;

        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //решение 1-й задачи
    private static void printThreeWords() {
        System.out.println("Banana\n" + "Apple\n" + "Orange");
    }
    //решение 2-й задачи
    public static boolean checkSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    //решение 3-й задачи
    private static void printColor() {
        int value = 75;

        if (value < 0) {
            System.out.println("Красный");
        } else if (value >= 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
}






