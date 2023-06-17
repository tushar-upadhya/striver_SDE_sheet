# approach
* Count the total number of nodes in the linked list by traversing through the list with a current pointer.
* Initialize variables count and prev as 0 and null, respectively.
* Set currentGroup as the head of the linked list.
* Set next as null.
* Reverse the nodes in groups of size k using a loop:
  * While currentGroup is not null and count is less than k, do the following:
  * Store the next node (next) of the current group before modifying the pointers.
  * Reverse the link of the current group to point to the previous node (prev).
  * Move prev and currentGroup one step forward by updating their values.
  * Increment count by 1.
 
* Decrease the total by k to keep track of the remaining nodes.
* If there are still enough remaining nodes (total >= k), recursively reverse the next group by calling reverseKGroup(next, k) and set the returned value as the next node of the current group.
* If there are not enough remaining nodes, connect the last group to the remaining nodes by setting head.next to next.
* Return prev as the new head of the reversed list.

  # time complexity  is O(n), where n is the total number of nodes in the linked list. This is because the code iterates through the linked list once to count the total number of nodes and then iterates again to reverse the nodes in groups of size k
  # space complexity  is O(1) because it uses a constant amount of extra space to store the pointers and variables for reversing the linked list. The space used does not depend on the input size or the number of nodes in the linked list


  # https://www.youtube.com/watch?v=Of0HPkk3JgI&t=469s
​
