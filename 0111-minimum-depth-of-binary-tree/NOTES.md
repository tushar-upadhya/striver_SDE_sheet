* The minDepth function takes a TreeNode object root as input and returns an integer representing the minimum depth of the tree.
* The first condition checks if the root is null, which means the tree is empty. In that case, the minimum depth is 0, so it returns 0.
* The second condition checks if the root is a leaf node, meaning it has no left or right child. In this case, the minimum depth is 1, so it returns 1.​
* The third condition checks if the root has no left child. If that's the case, it recursively calls minDepth on the right child and adds 1 to the result. This calculates the minimum depth of the right subtree.
* The fourth condition checks if the root has no right child. If true, it recursively calls minDepth on the left child and adds 1 to the result. This calculates the minimum depth of the left subtree.
* If none of the above conditions match, it means the root has both left and right children. In this case, it recursively calculates the minimum depth of both subtrees (left and right) and returns the minimum value plus 1.


#  time complexity is O(n)
#  space complexity is O(h), where h is the height of the tree
