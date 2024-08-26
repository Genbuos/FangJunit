package arrays;

public class CWMWSolution {
    public int mostWater(int[] nums){
        int maxArea = 0;
        int p1 = 0;
        int p2 = nums.length - 1;

        while ( p1 < p2){
            int y = Math.min(nums[p1],nums[p2]);
            int x = p2 - p1;
            int area = y * x;
            maxArea = Math.max(maxArea, area);
            if(nums[p1] <= nums[p2]){
                p1++;
            }else {
                p2--;
            }
        }
        return maxArea;
    }
}
