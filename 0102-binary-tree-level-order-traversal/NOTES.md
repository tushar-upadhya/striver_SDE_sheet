​* The function levelOrder is defined with a parameter root, which is the root of the binary tree.
* A Queue<TreeNode> named queue is created to store the nodes during the BFS traversal.
* A list of lists wraplist is created to store the node values at each level.
* If the root is null, it means the tree is empty, so the function returns an empty wraplist.
* If the root is not null, it is added to the queue.
* The BFS traversal starts with a while loop that runs until the queue is empty.
* Inside the loop, the variable levelNum is assigned the current size of the queue, which represents the number of nodes at the current level.
* A LinkedList<Integer> named sublist is created to store the node values of the current level.
* Another loop runs levelNum times to process the nodes at the current level:
  * If the node at the front of the queue has a left child, it is added to the end of the queue.
  * If the node at the front of the queue has a right child, it is added to the end of the queue.
  *  The value of the node at the front of the queue is added to the sublist.
  * The node at the front of the queue is removed (polled) from the queue.
    
* Once the inner loop finishes, all nodes at the current level have been processed, and the sublist containing their values is added to the wraplist.
* The outer while loop continues to the next level, and the process repeats until all levels have been processed.
* Finally, the wraplist, containing the node values of all levels in the tree, is returned.

# time complexity is O(N), where N is the number of nodes in the tree, as each node is visited once
#  space complexity is O(M), where M is the maximum number of nodes at any level in the tree (the maximum size of the queue during the traversal).
