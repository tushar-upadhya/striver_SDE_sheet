class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, result, 0);
        return result;
    }

    void backtrack(int[] nums, List<List<Integer>> result, int index) {

        if (index == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int i : nums) list.add(i);
            result.add(list);

        } else {
            for (int i = index; i < nums.length; i++) {
                swap(i , index, nums);
                backtrack(nums, result, index + 1);
                swap(i, index, nums);
            }
        }
    }

    void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
