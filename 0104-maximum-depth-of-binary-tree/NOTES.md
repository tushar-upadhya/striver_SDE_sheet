* The function maxDepth is defined with a parameter root, which is the root of the binary tree.
* If the root is null, it means the tree is empty, so the function returns 0, indicating that the depth of the tree is 0.
* If the root is not null, the function recursively calculates the maximum depth of the left and right subtrees.​
* The variable leftNode is assigned the maximum depth of the left subtree by calling the maxDepth function recursively on the left child of the current root.
* The variable rightNode is assigned the maximum depth of the right subtree by calling the maxDepth function recursively on the right child of the current root.
* The maximum depth of the tree is determined by taking the maximum value between leftNode and rightNode and adding 1 (to account for the current node).
* The maximum depth of the tree is returned as the result.

   # time complexity O(N)
  # space complexity O(N)
