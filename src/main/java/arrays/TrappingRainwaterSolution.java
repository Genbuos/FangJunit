package arrays;

public class TrappingRainwaterSolution {
    public int solve(int[] nums){

        int totalWater = 0;
        int maxR = 0 , maxL = 0;
        int leftP = 0, rightP = nums.length -1 ;
       while( leftP < rightP){
           if(nums[leftP] <= nums[rightP]){
               if(nums[leftP] >= maxL){
                   maxL = nums[leftP];
               }else{
                   totalWater += maxL - nums[leftP];
               }
               leftP ++;
           }else {
               if(nums[rightP] >= maxR){
                   maxR = nums[rightP];
               }else{
                   totalWater += maxR - nums[rightP];
               }
               rightP --;
           }
       }
        return totalWater;
    }
}
