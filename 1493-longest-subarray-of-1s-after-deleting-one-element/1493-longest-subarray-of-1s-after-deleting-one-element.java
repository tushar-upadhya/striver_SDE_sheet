class Solution {
    public int longestSubarray(int[] nums) {
        
        int prev = 0;
        int current = 0;
        int max = 0;
        
        for(int i = 0; i < nums.length; ++i){
            if(nums[i] == 1){
                current++;
                if(current + prev > max) max = current + prev;
            }
            else if(nums[i] == 0){
                prev = current;
                current = 0;
            }
        }
        if(max == nums.length) return max - 1;
        else
            return max;
    }
}