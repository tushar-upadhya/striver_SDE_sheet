# approach
* The method removeNthFromEnd takes two input parameters: head, which represents the head of the linked list, and n, which specifies the position of the node to remove from the end of the list.
* The code creates a new start node as a dummy node and sets its next reference to the head node. This dummy node helps handle the case where the head node itself needs to be removed.
* Two pointers, fast and slow, are initialized to point to the start node initially.
* The fast pointer is moved n positions ahead by traversing n nodes in the linked list. This is done using a loop that runs n times, updating the fast pointer to its next node in each iteration.4
* After moving the fast pointer n positions ahead, the fast and slow pointers are moved simultaneously until the fast pointer reaches the last node in the linked list.
* While moving the pointers, the fast pointer is advanced one node at a time, and the slow pointer is also advanced one node at a time. This ensures that the distance between the fast and slow pointers is always n nodes.
* When the fast pointer reaches the last node, the slow pointer will be pointing to the node just before the node to be removed.
* To remove the nth node from the end, the next reference of the slow pointer is updated to skip the next node and point directly to the node after the next node.
* Finally, the modified linked list is returned by accessing the next reference of the start node, which points to the head of the updated list.

#  time complexity  is O(L), where L is the length of the linked list.
#  space complexity is O(1) 
