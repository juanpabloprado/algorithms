public class LongestCommonPrefix {

    public static void main(String[] args) {
        // ["colorado", "color", "cold"], return "col"
        // ["a", "b", "c"], return ""
        // ["spot", "spotty", "spotted"], return "spot"
        System.out.println(longestCommonPrefix(new String[]{"colorado", "color", "cold"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder longestCommonPrefix = new StringBuilder();
        int index = 0;
        for (char c : strs[0].toCharArray()) {
            for (int i = 1; i < strs.length; i++) {
                if (index >= strs[i].length() || c != strs[i].charAt(index)) {
                    return longestCommonPrefix.toString();
                }
            }

            longestCommonPrefix.append(c);
            index++;
        }

        return longestCommonPrefix.toString();
    }
}
