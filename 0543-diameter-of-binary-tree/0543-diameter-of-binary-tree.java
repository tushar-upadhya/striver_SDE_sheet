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
    
    public int height(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
     
        if(root == null) return 0;
        
        int Root = height(root.left) + height(root.right);
        int leftRoot = diameterOfBinaryTree(root.right);
        int rightRoot = diameterOfBinaryTree(root.left);
        
        return Math.max(Root, Math.max(leftRoot, rightRoot));
    }
}