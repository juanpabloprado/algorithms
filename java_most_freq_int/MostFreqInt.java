import java.util.HashMap;
import java.util.Map;

public class MostFreqInt {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3};
//        int[] arr = {1, 5, 2, 1, 3, 2, 1};
//        int[] arr = {4, 1, 4, 1, 3};
//        int[] arr = {4};
//        int[] arr = {};
//        int[] arr = {0};
        int frequency = findMostFrequent(arr);
        System.out.println(frequency);
    }

    public static int findMostFrequent(int[] arr) {
        Map<Integer, Integer> integersCount = new HashMap<>();
        int maxCount = 0;
        int number = Integer.MIN_VALUE;
        for (Integer i : arr) {
            if (!integersCount.containsKey(i)) {
                integersCount.put(i, 1);
            } else {
                integersCount.put(i, integersCount.get(i) + 1);
            }
            if (maxCount < integersCount.get(i)) {
                maxCount = integersCount.get(i);
                number = i;
            }
        }
        return number;
    }
}