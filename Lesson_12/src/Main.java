//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var mass = new String[][]{
                {"15", "j", "32", "43","5"},
                {"53", "63", "72", "81"},
                {"91", "10", "112", "122"},
                {"11", "32", "22", "21"}
        };
        try {
            var result = Parray.pArray(mass);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Массив должен быть 4х4.");
        } catch (MyArrayDataException e) {
            System.out.printf("Неверные данные.", e.getRow(), e.getCol());
        }
        try {
            var arr = new int[5];
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Выход за массива.");
        }
    }
}

// Пользовательские исключения
class MyArraySizeException extends Exception {
}

class MyArrayDataException extends Exception {
    private final int row;
    private final int col;

    public MyArrayDataException(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}


