class Solution704 {
    public int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        int mid =0;



        for( int i = 0 ; i< nums.length ; i++){
            mid = (s+e)/2;

            if (nums[mid] == target){
                return mid;

            }
            else if ( nums[mid] > target){
                e = mid-1;


            }
            else if (nums[mid] < target){
                s = mid+1;

            }

        }
        return -1;
    }
}

public class BinarySearch704 {
}
