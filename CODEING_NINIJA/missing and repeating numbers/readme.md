# Problem Statement:
You are given a read-only array of N integers with values also in the range [1, N] both inclusive. Each integer appears exactly once except A which appears twice and B which is missing. The task is to find the repeating and missing numbers A and B where A repeats twice and B is missing.

# Approach:

* Initialize an array result of size 2 to store the missing and repeating elements.
* Iterate from 0 to n (inclusive).
* For each element i:
  * Check if the ArrayList arr contains i. If it does, remove the element from the ArrayList.
  * If it doesn't contain i, assign i as the missing element (result[0]).
The remaining element in the ArrayList is the repeating element, assign it to result[1].
* Return the result array.

# time complexity of this approach is O(n^2) 
space complexity is O(1) because we are using a fixed-size array result of size 2 to store the missing and repeating elements
