public class Solution {
    public int arrayPairSum(int[] nums) {
        int[] hashTable = new int[20001];
        for (int num : nums) {
            hashTable[num + 10000]++;
        }
        boolean n = true;
        int sum = 0;
        for (int i = 0; i < hashTable.length; i++) {
            while (hashTable[i] > 0) {
                if (n) {
                    sum += i - 10000;
                }
                hashTable[i]--;
                n = !n;
            }
        }
        return sum;
    }
}
