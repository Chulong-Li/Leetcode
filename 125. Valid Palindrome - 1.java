public class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse);        
    }
}
