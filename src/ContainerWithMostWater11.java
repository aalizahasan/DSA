class Solution11 {
    public int maxArea(int[] height) {

        int i = 0;
        int j = height.length -1;
        int maxCap = 0;

        while ( i != j ) {
            int h = Math.min( height[i], height[j]);

            int width = j-i;

            int currCap = width * h;

            maxCap = Math.max (maxCap , currCap);

            if ( height[i]< height[j]){
                i++;

            }
            else j--;

        }
        return maxCap;

    }
}

public class ContainerWithMostWater11 {
}
