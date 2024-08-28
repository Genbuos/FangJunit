package arrays;

public class MergeSortedArraySolution {
    /**
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;

        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] > nums2[p2]){
                // here we are assigning the nums1
                // value to the end of nums1 where p3 is pointing.
                // then decrement the respective pointers
                nums1[p3--] = nums1[p1--];
            }else{
                //otherwise we assign the nums2 value to p3
                nums1[p3--] = nums2[p2--];
            }
        }
        while(p2 >= 0){
            nums1[p3--] = nums2[p2--];
        }
    }
}
