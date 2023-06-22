class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        
        for (int num : nums) {
            count = (count + num) * num; 
            
            maxCount = Math.max(maxCount, count);
        }
        
        return maxCount;
    }
}
