class Solution {
    public int maxProduct(int[] nums) {
        int maxproduct = 0;
        for (int i = 0 ; i < nums.length ; i ++){
            for (int j = 0 ; j< nums.length ; j++){

                if (i!=j){
                    int product = (nums[i] - 1) * (nums[j]-1);
                    if (maxproduct < product){
                        maxproduct = product;
                    }


                }


            }
        }


        return maxproduct;





    }
}

public class MaximumProduct1464 {
}
