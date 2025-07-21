class Solution3427 {
    public int subarraySum(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n + 1];
        int total = 0;

        for (int i = 0; i < n; i++) {
            pre[i + 1] = pre[i] + nums[i];
        }

        for (int i = 0; i < n; i++) {
            int start = Math.max(0, i - nums[i]);
            total += pre[i + 1] - pre[start];
        }

        return total;
    }
}


public class SumOfVariableLengthSubArrays3427java {
}
