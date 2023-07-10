/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
     List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        int j = 0;
        q.offer(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            
            ArrayList<Integer> list = new ArrayList<>();
            
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                list.add(node.val);
                
                if(node.left!= null){
                    q.offer(node.left);
                }
                if(node.right != null){
                    q.offer(node.right);
                }
            }
            if(j % 2 == 1){
                Collections.reverse(list);
            }
            result.add(new ArrayList<>(list));
                       j++;
        }
                       return result;
    }
}