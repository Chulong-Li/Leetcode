public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1, sum;
        do {
            sum = numbers[left] + numbers[right];
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            }
        } while (sum != target);
        return new int[] {++left, ++right};
    }
}
