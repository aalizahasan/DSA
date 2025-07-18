class Solution167th {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];

        int i = 0;
        int j = numbers.length-1;

        for ( int k = 0 ; k < numbers.length ; k++){

            if (i !=j){
                int sum = numbers[i] + numbers[j];
                if (sum == target){
                    ans[0] = i+1;
                    ans[1] = j+1;

                }
                else if (sum < target){
                    i++;
                    ans[0] = i;
                    ans[1] = j+1;

                }
                else if (sum >target ){
                    j--;
                    ans[0] = i+1;
                    ans[1] = j+2;
                }
            }
        }
        return ans;

    }
}

public class TwoSumSortedOptimal {
}
