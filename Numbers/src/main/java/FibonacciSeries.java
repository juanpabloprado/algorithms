
/**
 * The Fibonacci series is a series of numbers in which each term is the sum of the two preceding terms.
 * It's first two terms are 0 and 1.
 * For example, the first 11 terms of the series are 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, and 55.
 * In mathematical terms, the sequence Sn of the Fibonacci numbers is defined by the recurrence relation:
 * S(n) = S(n-1) + S(n-2), with S(0) = 0 and S(1) = 1
 */
public class FibonacciSeries {

    public static void main(String[] args) {
        System.out.println(nthFibonacciTermRecursive(8));
    }

    public static int nthFibonacciTermRecursive(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return nthFibonacciTermRecursive(n - 1) + nthFibonacciTermRecursive(n - 2);
    }

    public static int nthFibonacciTermIterative(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int n0 = 0, n1 = 1;
        int tempNthTerm;
        for (int i = 2; i <= n; i++) {
            tempNthTerm = n0 + n1;
            n0 = n1;
            n1 = tempNthTerm;
        }
        return n1;
    }

    /**
     * The Fibonacci terms maintain a ratio called golden ratio denoted by Φ, the Greek character´ pronounced ‘phi'.
     * First, let's look at how the golden ratio is calculated:
     * Φ = ( 1 + √5 )/2 = 1.6180339887...
     * Now, let's look at Binet's formula:
     * Sn = Φⁿ–(– Φ⁻ⁿ)/√5
     * Actually, this means that we should be able to get the nth Fibonacci number with just some arithmetic.
     */
    public static int nthFibonacciTermUsingBinetsFormula(int n) {
        final double sqrtOf5 = Math.sqrt(5);
        final double phi = (1 + sqrtOf5) / 2;
        return (int) ((Math.pow(phi, n) - Math.pow(-phi, -n)) / sqrtOf5);
    }
}