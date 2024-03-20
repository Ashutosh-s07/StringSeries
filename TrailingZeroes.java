public class TrailingZeroes {

    public static int trailingZerosInFactorial(int n) {
		// Lets intialise our current factorial = 1.
		int currentFactorial = 1;
		// Calculate factorial till N.
		for (int i = 2; i <= n; i++) {

			currentFactorial = currentFactorial * i;
		}

		// Count number of trailing zeros.
		int numOfZeroes = 0;
		while (currentFactorial % 10 == 0) {

			numOfZeroes++;
			currentFactorial /= 10;
		}

		return numOfZeroes;
    }

    public static void main(String[] args) {
        int n = 2147;
        System.out.println(trailingZerosInFactorial(n));
    }
}
