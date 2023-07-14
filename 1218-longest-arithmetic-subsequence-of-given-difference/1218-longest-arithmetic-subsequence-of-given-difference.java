class Solution {
    public int longestSubsequence(int[] arr, int difference) {
     HashMap<Integer, Integer> hashmap = new HashMap<>();
     int count = 0;

     for(int i = 0; i < arr.length; i++){
         hashmap.put(arr[i], hashmap.getOrDefault(arr[i] - difference, 0) + 1);
         count = Math.max(count, hashmap.get(arr[i]));
     }   
     return count;
    }
}