class Solution {
    public int removeElement(int[] nums, int val) {
        // int k : count of all num != val 
        int k = 0;
        for(int i =0;i<nums.length;i++){
            // if nums[i] != val nums[k] = nums[i] k++
            if(nums[i] != val){
                nums[k++] = nums[i];
            }
        }
        //return k 
        return k;
    }
}