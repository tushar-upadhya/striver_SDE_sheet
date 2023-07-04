​* The height method is defined to calculate the height of a subtree rooted at a given node. It takes a TreeNode parameter root and returns the height of the subtree.
  * If the root is null, indicating an empty subtree, the method returns -1.
  * Otherwise, the method recursively calculates the height of the left and right subtrees using the height method. It then returns the maximum of the heights of the left and right subtrees plus 1.

* The isBalanced method checks whether the entire binary tree is balanced or not. It takes a TreeNode parameter root and returns a boolean indicating whether the tree is balanced.
  * If the root is null, indicating an empty tree, the method returns true as an empty tree is considered balanced.
Otherwise, the method calculates the heights of the left and right subtrees using the height method.
  * If the absolute difference between the heights is greater than 1, indicating an imbalance, the method returns false.
  * Otherwise, the method recursively checks whether the left and right subtrees are balanced by calling the isBalanced method on each subtree.
  * If both subtrees are balanced, the method returns true; otherwise, it returns false. 
