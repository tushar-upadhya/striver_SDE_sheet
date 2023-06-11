# Approach:

* Create a HashSet named "set" to store the unique elements from the input array.
* Iterate through the input array and add each element to the HashSet.
* Initialize a variable named "longest" to keep track of the longest consecutive sequence length.
* Iterate through the input array again:
  * For each element, check if its previous element (num - 1) is present in the HashSet.
  * If the previous element is not present, it indicates the start of a new consecutive sequence.
  * In such cases, initialize two variables: "currentNum" with the current element and "currentStreak" as 1.
  * While the next consecutive element (currentNum + 1) is present in the HashSet, increment "currentNum" and "currentStreak".
  * Update the "longest" variable if the currentStreak is longer than the previous longest sequence
  * Return the "longest" variable, which represents the length of the longest consecutive sequence.

# Time Complexity is O(n) code iterates through the input array twice: once to populate the HashSet and once to find the longest consecutive sequence AND Both iterations have a linear time complexity with respect to the size of the input array.

# Space Complexity: O(n) hashSet stores the unique elements from the input array, which can have a maximum size of n.
