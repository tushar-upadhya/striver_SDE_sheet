* The maxPathSum function takes a TreeNode called root as input and returns an integer representing the maximum path sum.

* Inside the maxPathSum function, we initialize an array maxValue of size 1 to store the maximum sum encountered so far. We set its initial value to Integer.MIN_VALUE.

* We call the maxPathDown function, passing the root node and the maxValue array as arguments. This function will recursively calculate the maximum path sum starting from each node and update the maxValue array accordingly.

* The maxPathDown function is a helper function that takes a TreeNode called node and the maxValue array as input and returns the maximum path sum starting from that node.

* In the maxPathDown function, we first check if the current node is null. If it is, we return 0, as there are no nodes in the subtree and the maximum sum is 0.

* We calculate the maximum path sums of the left and right subtrees by recursively calling the maxPathDown function on them. We use Math.max to ensure that negative sums are not considered in the path.

* We calculate the sum by adding the value of the current node, the maximum sum of the left subtree (left), and the maximum sum of the right subtree (right).

* We update the maxValue[0] with the maximum of the current maxValue[0] and the calculated path sum (left + right + node.val). This keeps track of the maximum sum encountered so far.

* Finally, we return the maximum of the left and right sums plus the value of the current node (Math.max(left, right) + node.val). This represents the maximum path sum starting from the current node, which will be used by the parent nodes in their calculations.

* After the recursive calls in the maxPathSum function, we return the final maximum sum stored in maxValue[0].​

#  time complexity is O(N)
# space complexity is O(H)

# 
https://www.youtube.com/watch?v=0ca1nvR0be4
