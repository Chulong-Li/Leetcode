public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (set.contains(s.charAt(j))) {
                    max = max > set.size() ? max : set.size();
                    set.clear();
                    break;
                } else {
                    set.add(s.charAt(j)); 
                }
            }
        }
        return Math.max(max, set.size());
    }
}
