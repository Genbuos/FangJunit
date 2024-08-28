package arrays;

import java.util.HashMap;
//TODO Refactor className for this file and its test counter part.
public class TwoSumSolution {
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

//        for(int p1= 0; p1 < nums.length; p1++){
//            var diff = target - nums[p1];
//            for(int p2 = p1 + 1; p2 < nums.length; p2++){
//                if(diff == nums[p2]){
//                    return new int[]{p1, p2};
//                }
//            }
//        }
//
//        return null;
    }
}
