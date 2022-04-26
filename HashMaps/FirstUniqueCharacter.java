import java.util.HashMap;
import java.util.Map;

/* Given a string, return the index of its first unique character. If a unique character does not exist, return -1. */
public class FirstUniqueCharacter {

    public static void main(String[] args) {
        // "abcabd", return 2
        // "thedailybyte", return 1
        // "developer", return 0
        System.out.println(firstUniqChar("abcabd"));
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> charIndices = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (charIndices.containsKey(current)) {
                charIndices.put(current, Integer.MAX_VALUE);
            } else {
                charIndices.put(current, i);
            }
        }

        int min = Integer.MAX_VALUE;
        for (char c: charIndices.keySet()) {
            min = Math.min(min, charIndices.get(c));
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
