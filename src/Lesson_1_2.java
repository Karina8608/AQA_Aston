
//решение 14-й задачи
public class Lesson_1_2 {
    public static void main(String[] args) {
        int len = 25;
        int initialValue = 5;

        int[] resultArray = createArray(len, initialValue);

        // Выводим массив
        for (int value : resultArray) {
            System.out.print(value + " ");
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
