class SolutionW {
    public int[] twoSum(int[] nums, int target) {

        int []ans = new int[2];

        for (int i = 0; i< nums.length ; i++){
            for (int j= 0; j<nums.length-1; j++){
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


public class WaterBottles {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = s.twoSum(nums, target);
        System.out.println("Indexes: " + result[0] + ", " + result[1]);  
    }
}
