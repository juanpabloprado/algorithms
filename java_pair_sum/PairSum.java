import java.util.HashSet;
import java.util.Set;

class PairSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 2147483639};
        int n = Integer.MAX_VALUE;
        printPairs(arr, n);
    }

    public static void printPairs(int[] arr, int sum) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            int diff = sum - i;

            if (set.contains(diff)) {
                System.out.printf("Pair with given sum %d is (%d, %d)%n", sum, i, diff);
            }
            set.add(i);
        }
    }
}