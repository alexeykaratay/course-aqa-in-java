package lesson7;

public class MyArrayDataException extends MyOwnEception {

    MyArrayDataException(int row, int col) {
        super(String.format("Неверные данные находятся на пересечении столбца " + (col + 1) + " и строки " + (row + 1)));
    }
}
