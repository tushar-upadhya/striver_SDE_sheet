​* Create a HashMap called hashmap to store the count of each number.
* Iterate through the nums array using a for-each loop:
  * For each number num in nums, update its count in the HashMap using hashmap.put(num, hashmap.getOrDefault(num, 0) + 1). If the number is not already present in the HashMap, the getOrDefault method will return 0 as the default value and then increment it by 1.
* Iterate through the entries of the HashMap using a for-each loop:
  * For each entry (entry.getKey() is the number, entry.getValue() is the count), check if the count is equal to 1.
  * If the count is equal to 1, return the corresponding number as it is the single number.
* If no single number is found, return 0.

#  time complexity is O(n)
# space complexity is O(n)
