The permute method initializes an empty result list to store all permutations. It then calls the backtrack method to start the backtracking process with the initial index set to 0.

* The backtrack method is a recursive function that generates permutations by swapping elements. It takes the nums array, the result list, and the current index as parameters.​
* If the index reaches the length of the nums array, it means we have formed a complete permutation. In this case, we create a new list and add each element of nums to it. This list represents a valid permutation, so we add it to the result list.
* If the index is less than the length of the nums array, we iterate from the current index to the end of the nums array.

* Inside the loop, we swap the elements at indices i and index using the swap method.

* We then make a recursive call to the backtrack method with the updated nums array and the incremented index by 1. This step allows us to generate permutations with the current element fixed and the remaining elements.
* After the recursive call, we swap the elements back to restore the original order of the nums array. This swapping step is necessary to ensure all possible combinations are explored.
* Once all iterations are complete, the permute method returns the result list containing all the generated permutations.

  #  time complexity is O(N!), where N represents the length of the nums array. This is because there are N! possible permutations of N distinct elements.
  # The space complexity is O(N) as we are using recursion and maintaining a call stack of maximum depth N during the backtracking process.
