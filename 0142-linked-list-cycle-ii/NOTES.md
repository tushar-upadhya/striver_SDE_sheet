# approach
* Initialize three pointers, slow, fast, and entry, all pointing to the head of the linked list.
* Use the fast pointer to move two steps at a time and the slow pointer to move one step at a time. If there is a cycle in the linked list, these two pointers will eventually meet at some point.​
* Once the fast and slow pointers meet, reset the slow pointer to the head of the linked list while keeping the fast pointer at the meeting point.
* Move both the slow and entry pointers one step at a time until they meet. The point at which they meet will be the starting point of the cycle.
* If there is no cycle in the linked list, the fast pointer will reach the end of the list, and we can return null to indicate the absence of a cycle.

#  time complexity is O(N)
# space complexity is O(1)
