/* Given a string and the ability to delete at most one character, return whether it can form a palindrome.
Note: a palindrome is a sequence of characters that reads the same forwards and backwards. */
public class ValidPalindromeWithRemoval {

    public static void main(String[] args) {
        // "abcba", returns true
        // "foobof", returns true (remove the first 'o', the second 'o', or 'b')
        // "abccab", returns false
        System.out.println(validPalindrome("abccab"));
    }

    public static boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }

            i++;
            j--;
        }

        return true;
    }

    public static boolean isPalindrome(String s, int i, int j) {
        while(i < j) {
            if(s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }

        return true;
    }
}
