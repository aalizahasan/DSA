class Solution268 {
    public int missingNumber(int[] nums) {

        int n = nums.length;

        int Total = ( n * (n+1) ) / 2;
        int d = 0;
        for (int i = 0 ; i< nums.length ; i++){
            d =  d + nums[i];
        }
        int ans = Total - d;
        return ans;




    }
}






public class MissingNumber268 {
}
