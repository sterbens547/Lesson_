public class Parray {
        public static int pArray (String[][] array) throws MyArraySizeException, MyArrayDataException {
            if (array.length != 4 || array[0].length != 4) {
                throw new MyArraySizeException();
            }
            int sum = 0;
            for (var i = 0; i < 4; i++) {
                for (var j = 0; j < 4; j++) {
                    try {
                        sum += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }
                }
            }
            return sum;
        }
}