Problem Statement: Given an array containing both positive and negative integers, we have to find the length of the longest subarray with the sum of all elements equal to zero.
```
Example 1:

Input Format: N = 6, array[] = {9, -3, 3, -1, 6, -5}

Result: 5

Explanation: The following subarrays sum to zero:
{-3, 3} , {-1, 6, -5}, {-3, 3, -1, 6, -5}
Since we require the length of the longest subarray, our answer is 5!
Example 2:

Input Format: N = 8, array[] = {6, -2, 2, -8, 1, 7, 4, -10}

Result: 8

Subarrays with sum 0 : {-2, 2}, {-8, 1, 7}, {-2, 2, -8, 1, 7}, {6, -2, 2, -8, 1, 7, 4, -10}
Length of longest subarray = 8
Example 3:

Input Format: N = 3, array[] = {1, 0, -5}

Result: 1

Subarray : {0}
Length of longest subarray = 1
Example 4:

Input Format: N = 5, array[] = {1, 3, -5, 6, -2}

Result: 0

Subarray: There is no subarray that sums to zero
```

--- 

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
		HashMap<Integer,Integer> map = new HashMap<>();
		
		// int n = arr.	
		int sum = 0;
		int max = 0;
		int max1 = 0;

		for(int i = 0; i < arr.size(); i++){
			sum += arr.get(i);

			if(map.containsKey(sum)){	
			max1 = i - (map.get(sum));
			}
			else map.put(sum, i);
			if(sum == 0) max1 = i + 1;
			max = Math.max(max, max1);
		}
		return max;
	}
}

* Approach:

* Create a HashMap named "map" to store the cumulative sum and its corresponding index.
* Initialize variables: "sum" to keep track of the cumulative sum, "max" to store the length of the longest subset with a sum of zero, and "max1" to store the current length of the subset.
* Iterate through the input ArrayList:
  * Add the current element to the cumulative sum.
  * Check if the cumulative sum already exists in the HashMap.
  * If it exists, update "max1" by calculating the difference between the current index and the index stored in the HashMap for the same cumulative sum.
  * If the cumulative sum doesn't exist in the HashMap, add it to the HashMap with its corresponding index.
  * Check if the cumulative sum is zero, indicating a subset with a sum of zero. If so, update "max1" to include the current element.
  *  Update "max" with the maximum value between "max" and "max1".

* Return the value of "max", which represents the length of the longest subset with a sum of zero.

# Time Complexity is O(n) iterates through the input ArrayList once, performing constant-time operations for each element.
# Space Complexity is O(n) HashMap stores the cumulative sums and their corresponding indices.
