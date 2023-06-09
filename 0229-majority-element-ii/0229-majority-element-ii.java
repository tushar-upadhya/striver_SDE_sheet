class Solution {
    public List<Integer> majorityElement(int[] nums) {
       
        int count1 = 0;
        int count2 = 0;
        
        int num1 = -1;
        int num2 = -1;
        
        int n = nums.length;
        
        // Find potential candidates for majority elements
       
        for (int num : nums) {
            if (num == num1)
                count1++;
            else if (num == num2)
                count2++;
            else if (count1 == 0) {
                count1 = 1;
                num1 = num;
            } else if (count2 == 0) {
                count2 = 1;
                num2 = num;
            } else {
                count1--;
                count2--;
            }
        }
        
        // Count the actual frequency of selected numbers in the array
      
        int freq1 = 0;
        int freq2 = 0;
        
        for (int num : nums) {
            if (num == num1)
                freq1++;
            else if (num == num2)
                freq2++;
        }
        
        List<Integer> result = new ArrayList<>();
        
        // Check if the frequencies exceed the threshold (n/3)
        
        if (freq1 > n / 3)
            result.add(num1);
        if (freq2 > n / 3)
            result.add(num2);
        
        return result;
    }
}
