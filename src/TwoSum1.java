class Sol {
    public int[] twoSum(int[] nums, int target) {

        int [] ans  = new int [2];
        for (int i = 0 ; i< nums.length ; i++){
            for (int j = 0 ; j< nums.length ; j++){
                if (nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }
}

public class TwoSum1 {
}
