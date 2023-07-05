* ​The lowestCommonAncestor method takes three parameters: root, p, and q, representing the root of the binary tree and the two nodes whose LCA needs to be found. It returns the LCA of p and q.

* The method starts by checking three base cases:
  * If the root is null or if root is equal to either p or q, it means that either p or q has been found, or the subtree is empty. In both cases, the method returns the current root as the LCA.
* If the base cases are not met, the method recursively calls itself on the left and right subtrees:
   * left is assigned the result of calling lowestCommonAncestor on the left subtree (root.left) with the same p and q parameters.
   * right is assigned the result of calling lowestCommonAncestor on the right subtree (root.right) with the same p and q parameters.
* The method then performs the following checks to determine the LCA:
  * If left is null, it means both p and q are in the right subtree, so the LCA must be in the right subtree. Therefore, the method returns right.
  * If right is null, it means both p and q are in the left subtree, so the LCA must be in the left subtree. Therefore, the method returns left.
  * If both left and right are not null, it means p and q are in different subtrees, so the current root is the LCA. Therefore, the method returns root.

https://www.youtube.com/watch?v=_-QHfMDde90&t=784s
