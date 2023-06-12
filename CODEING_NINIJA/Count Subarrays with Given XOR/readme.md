* Problem Statement: Given an array of integers A and an integer B. Find the total number of subarrays having bitwise XOR of all elements equal to k.

```
Example 1:
Input Format: A = [4, 2, 2, 6, 4] , k = 6
Result: 4
Explanation: The subarrays having XOR of their elements as 6 are  [4, 2], [4, 2, 2, 6, 4], [2, 2, 6], [6]

Example 2:
Input Format: A = [5, 6, 7, 8, 9], k = 5
Result: 2
Explanation: The subarrays having XOR of their elements as 5 are [5] and [5, 6, 7, 8, 9]
```
***

```
public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
  		HashMap<Integer,Integer> map = new HashMap<>(); 
        int sum = 0;
        int count = 0;
      
	    for(int i =0;i<arr.size();i++){
            int elem = arr.get(i);
            sum = sum^elem;
            //find its subsequent to make x
      
	        if(map.containsKey(x^sum)){
                count+= map.get(x^sum);
            }
            //sum will be formed
      
	        if(sum==x)count++;        
            //check the sum frquency in map
      
	        if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }else{
                map.put(sum,1);
            } 
        }
        return count;
	}
}
```


*** 
# Approach
* Create a HashMap named "map" to store the cumulative XOR values and their frequencies.
* Initialize variables: "sum" to keep track of the cumulative XOR value, "count" to store the count of subarrays with the given XOR value.
* Iterate through the input ArrayList:
* Get the current element from the ArrayList.
* Update "sum" by performing XOR with the current element.
* Check if the cumulative XOR value (x^sum) exists in the HashMap.
* If it exists, add the frequency of the cumulative XOR value to "count".
* Check if the cumulative XOR value is equal to the target XOR value (x).
* If it is, increment "count" to account for the subarray itself.
* Check if the cumulative XOR value exists in the HashMap.
* Return the value of "count", which represents the count of subarrays with the given XOR value.

#  time complexity  O(n)
# space complexity O(n)

