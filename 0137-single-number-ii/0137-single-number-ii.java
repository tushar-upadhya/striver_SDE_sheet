class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hashmap = new HashMap();
        for(int num : nums)
        hashmap.put(num, hashmap.getOrDefault(num, 0) + 1);

        for(HashMap.Entry<Integer,Integer> entry : hashmap.entrySet()){
            if(entry.getValue() == 1)
            return entry.getKey();
        }
        return 0;
    }
}