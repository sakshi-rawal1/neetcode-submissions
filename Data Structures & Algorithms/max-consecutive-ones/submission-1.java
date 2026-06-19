class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // max : max number of 1's
        int max = 0;
        // local count; 
        int count = 0;
        for(int num : nums){
            if(num == 1){
                // num == 1; count++
                count++;
            } else {
                //update max before resetting count
                max = Math.max(max, count);
                // num == 0 reset count to 0 
                count = 0;
            }
        }
         
        //if the nums end with 1 we have to compare and return max 
        return Math.max(max, count);
    }
}
//TC : O(n)
//SC : O(1)
