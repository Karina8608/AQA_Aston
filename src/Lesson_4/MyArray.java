package Lesson_4;

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}

public class MyArray {
    public static void main(String[] args) {
        String[][] inputArray = {
                {"8", "2", "30", "4"},
                {"15", "6", "67", "8"},
                {"29", "10", "55", "12"},
                {"13", "24", "15", "16"}
        };

        try {
            int result = processArray(inputArray);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }

    @SuppressWarnings("ClassEscapesDefinedScope")
    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int rows = array.length;
        int cols = array[0].length;

        if (rows != 4 || cols != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4x4");
        }

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }
}

