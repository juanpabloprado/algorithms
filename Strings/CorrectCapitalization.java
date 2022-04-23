/* Given a string, return whether or not it uses capitalization correctly.
A string correctly uses capitalization if all letters are capitalized, no letters are capitalized,
or only the first letter is capitalized. */
public class CorrectCapitalization {

    public static void main(String[] args) {
        // "USA", returns true
        // "Calvin", returns true
        // "compUter", returns false
        // "coding", returns true
        System.out.println(detectCapitalUse("coding"));
    }


    public static boolean detectCapitalUse(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                count++;
            }
        }

        return count == word.length() || count == 0 || count == 1 && Character.isUpperCase(word.charAt(0));
    }
}
