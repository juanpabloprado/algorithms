import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Given two integer arrays, return their intersection.
Note: the intersection is the set of elements that are common to both arrays. */
public class IntersectionOfNumbers {
    public static void main(String[] args) {
        // nums1 = [2, 4, 4, 2], nums2 = [2, 4], return [2, 4]
        // nums1 = [1, 2, 3, 3], nums2 = [3, 3], return [3]
        // nums1 = [2, 4, 6, 8], nums2 = [1, 3, 5, 7], return []
        int[] nums1 = {2, 4, 4, 2};
        int[] nums2 = {2, 4};
        System.out.println(intersection(nums1, nums2));
    }

    public static List<Integer> intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }

        List<Integer> intersection = new ArrayList<>();
        for (int j : nums2) {
            if (set.contains(j)) {
                intersection.add(j);
                set.remove(j);
            }
        }

        return intersection;
    }
}
