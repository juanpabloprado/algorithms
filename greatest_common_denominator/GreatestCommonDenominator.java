public class GreatestCommonDenominator {
    public static int gcd(int a, int b) {
        int t = 0;
        while (b != 0) {
            t = a;
            a = b;
            b = t % b;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcd(60, 96)); // should be 12
        System.out.println(gcd(20, 8));  // should be 4
    }
}
