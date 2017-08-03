public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        int max = 0, temp = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (set.contains(s.charAt(j))) {
                    max = max > temp ? max : temp;
                    set.clear();
                    temp = 0;
                    break;
                } else {
                    set.add(s.charAt(j)); 
                    temp++;
                }
            }
        }
        return Math.max(max, temp);
    }
}
