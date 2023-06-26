class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, 0, ans, subset);
        return ans;
    }
    
    private void backtrack(int[] candidates, int target, int start, int sum, List<List<Integer>> ans, List<Integer> subset) {
        if (sum == target) {
            ans.add(new ArrayList<>(subset));
            return;
        }
        
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue; // Skip duplicates to avoid duplicate subsets
            }
            
            if (sum + candidates[i] > target) {
                break; // Stop exploring this branch if the sum exceeds the target
            }
            
            subset.add(candidates[i]);
            backtrack(candidates, target, i + 1, sum + candidates[i], ans, subset);
            subset.remove(subset.size() - 1);
        }
    }
}
