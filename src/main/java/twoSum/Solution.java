package twoSum;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int difference = target - nums[i];
            if(numMap.containsKey(difference)){
                return new int[] {numMap.get(difference), i};
            }
            numMap.put(nums[i], i);
        }
        return null;
    }
}
