import java.util.HashSet;
import java.util.Set;

/* Given a string representing your stones and another string representing a list of jewels,
return the number of stones that you have that are also jewels. */
public class JewelsAndStones {

    public static void main(String[] args) {
        // jewels = "abc", stones = "ac", return 2
        // jewels = "Af", stones = "AaaddfFf", return 3
        // jewels = "AYOPD", stones = "ayopd", return 0
        System.out.println(numJewelsFromStones("abc", "ac"));
    }

    public static int numJewelsFromStones(String stones, String jewels) {
        Set<Character> jewelsSet = new HashSet<>();
        for(char c: jewels.toCharArray()) {
            jewelsSet.add(c);
        }

        int numJewels = 0;
        for(char c: stones.toCharArray()) {
            if(jewelsSet.contains(c)) {
                numJewels++;
            }
        }

        return numJewels;
    }
}
