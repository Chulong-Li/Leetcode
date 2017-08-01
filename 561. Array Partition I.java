public class Solution {
    public int arrayPairSum(int[] nums) {
        int[] sortedArray = new int[nums.length];
        sortedArray = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedArray);
        int sum = 0;
        for (int i = 0; i < sortedArray.length; i = i + 2) {
            sum += sortedArray[i];
        }
        return sum;
    }
}
