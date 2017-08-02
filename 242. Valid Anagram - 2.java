public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] hashTable = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hashTable[s.charAt(i) - 'a']++;
            hashTable[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (hashTable[i] != 0) return false;
        }
        return true;
    }
}
