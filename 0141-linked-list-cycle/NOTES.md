# approach
* The function takes the head of a linked list as an input parameter
* It initializes two pointers, fast and slow, both pointing to the head of the linked list
* The while loop iterates as long as the fast pointer has a next node and the next node of the next node (fast.next.next) is not null
* In each iteration, the fast pointer moves two steps ahead, while the slow pointer moves one step ahead
* If there is a cycle in the linked list, at some point, the fast pointer will catch up to the slow pointer, indicating the presence of a cycle. In this case, the function returns true
* If the loop completes without finding a cycle (fast pointer reaches the end of the linked list), the function returns false

# time complexity is O(n), where n is the number of nodes in the linked list. The fast pointer moves twice as fast as the slow pointer, allowing it to detect a cycle in a linear time complexity​
#  space complexity is O(1)
