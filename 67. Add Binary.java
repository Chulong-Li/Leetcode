public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sum = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while (i >= 0 || j >= 0) {
            int digit = carry;
            if (i >= 0) digit += a.charAt(i--) - '0';
            if (j >= 0) digit += b.charAt(j--) - '0';
            sum.insert(0, digit % 2);
            carry = digit / 2;
        }
        if (carry != 0) {
            sum.insert(0, "1");
        }
        return sum.toString();
    }
}
