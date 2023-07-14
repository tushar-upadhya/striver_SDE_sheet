* The buildTree function takes two integer arrays preorder and inorder as input and returns the root node of the constructed binary tree.

* The helper function is a recursive helper function that constructs the binary tree using the preorder and inorder traversal sequences. It takes the following parameters:
  * preStart: the starting index of the current subtree in the preorder traversal sequence
  * inStart: the starting index of the current subtree in the inorder traversal sequence
  * inEnd: the ending index of the current subtree in the inorder traversal sequence
  * preorder: the array representing the preorder traversal sequence
  * inorder: the array representing the inorder traversal sequence

* The base case of the helper function checks if preStart is greater than the last index of the preorder sequence or if inStart is greater than inEnd. If either of these conditions is true, it means there are no more nodes to process, so it returns null.
* Inside the helper function, we create a TreeNode object root with the value at preorder[preStart]. This node will be the root of the current subtree.
* We find the index inIndex in the inorder sequence where the root value occurs. This index helps us determine the left and right subtrees of the current node.
* Using the inIndex, we recursively construct the left and right subtrees of the current node:

 * The left subtree is constructed by calling helper with updated indices for the preorder and inorder sequences. The preorder sequence starts from 
 * preStart + 1, the inorder sequence starts from inStart, and ends at inIndex - 1.
 * The right subtree is constructed by calling helper with updated indices for the preorder and inorder sequences. The preorder sequence starts from preStart + inIndex - inStart + 1, the inorder sequence starts from inIndex + 1, and ends at inEnd.

* Finally, we return the root node, which represents the constructed binary tree.

  # time complexity is O(N)
  # space complexity is O(N)
