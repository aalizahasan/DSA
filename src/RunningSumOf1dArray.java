class Solution1480 {
    public int[] runningSum(int[] nums) {

        int runSum = 0;
        nums[runSum] = nums[0];
        for (int i = 1 ; i< nums.length ; i++){
            nums[runSum+1] = nums[runSum] + nums[i];
            nums[i] = nums[runSum+1];
            runSum++;
        }
        return nums;

    }
}

public class RunningSumOf1dArray {
}
