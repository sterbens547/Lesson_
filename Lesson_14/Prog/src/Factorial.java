public class Factorial {

    public static long factorial(int n) {
        if (n < 0) {
            throw new
                    IllegalArgumentException("undefined");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;

    }
}