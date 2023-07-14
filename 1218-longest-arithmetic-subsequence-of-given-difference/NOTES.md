​* The longestSubsequence function takes an integer array arr and an integer difference as input and returns an integer representing the length of the longest arithmetic subsequence.

* Inside the function, we initialize a HashMap called hashmap to store the count of each number in the array and its corresponding longest arithmetic subsequence length.

* We initialize a variable count to keep track of the maximum length encountered so far.

* We iterate over the array arr using a for loop. For each element arr[i], we calculate the previous element in the arithmetic subsequence by subtracting the difference from arr[i].

* We use the getOrDefault method of the HashMap to get the count of the previous element. If the previous element exists in the HashMap, we increment its count by 1. Otherwise, we set its count to 1.

* We update the count variable by taking the maximum of the current count and the count of the current element in the HashMap. This ensures that we always have the maximum length of the arithmetic subsequence.

* After processing all elements in the array, we have the length of the longest arithmetic subsequence stored in the count variable. We return this value as the result.

  # time complexity is O(N)
  # space complexity is O(N)
