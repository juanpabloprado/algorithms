public class ReverseString {
    public static void main(String[] args) {
        String cat = "Cat";
        System.out.println(reverse(cat));
    }

    public static String reverse(String s) {
        char[] characters = new char[s.length()];
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            characters[j++] = s.charAt(i);
        }

        return new String(characters);
    }
}
