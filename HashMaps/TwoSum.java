import java.util.HashSet;
import java.util.Set;

/* Given an array of integers, return whether two numbers sum to a given target, k.
Note: you may not sum a number with itself. */
public class TwoSum {
    public static void main(String[] args) {
        // [1, 3, 8, 2], k = 10, return true (8 + 2)
        // [3, 9, 13, 7], k = 8, return false
        // [4, 2, 6, 5, 2], k = 4, return true (2 + 2)
        System.out.println(twoSum(new int[]{1, 3, 8, 2}, 10));
    }

    public static boolean twoSum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            int difference = k - num;
            if (set.contains(difference)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}
