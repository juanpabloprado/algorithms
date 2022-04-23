public class AddBinary {

    public static void main(String[] args) {
        // "100" + "1", return "101"
        // "11" + "1", return "100"
        // "1" + "0", return  "1"
        System.out.println(addBinary("100", "1"));
    }

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            sb.append(sum % 2);
            carry = sum / 2;
        }

        if (carry != 0) {
            sb.append(1);
        }

        return sb.reverse().toString();
    }
}