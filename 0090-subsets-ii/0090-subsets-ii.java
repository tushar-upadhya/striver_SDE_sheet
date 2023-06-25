class Solution {
    public void find_Subset(int index, int nums[], List<Integer>ds, List<List<Integer>> ansList){
      
        ansList.add(new ArrayList<>(ds));
        
        for(int i = index; i < nums.length; i++){
        
            if(i != index && nums[i] == nums[i - 1]) continue;
            ds.add(nums[i]);

            find_Subset(i + 1, nums, ds, ansList);
            ds.remove(ds.size() - 1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        
        List<List<Integer>> ansList = new ArrayList<>();
        find_Subset(0, nums, new ArrayList<>(), ansList);
        return ansList;

    }   
}