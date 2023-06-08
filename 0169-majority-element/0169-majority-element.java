class Solution {
    public int majorityElement(int[] nums) {
        int elem = 0;
        int count = 0;
        
        for (int i = 0; i < nums.length; i++){
            if (nums[elem] == nums[i]){
                count++;
            }
            if (nums[elem] != nums[i]){
                count--;
            }
            if (count == 0){
                elem = i;
                count = 1;
            }
        }
        return nums[elem];
        
    }
}