​# approach
* Initialize two pointers, p1 and p2, to the heads of the input linked lists headA and headB, respectively.
* Start a loop that continues until p1 and p2 meet.
* Within each iteration
    * Check if p1 has reached the end of list A
    * If yes, reset p1 to the head of list B to continue traversing list B
    * Check if p2 has reached the end of list B
    * If yes, reset p2 to the head of list A to continue traversing list A
    * Move both pointers p1 and p2 to the next nodes in their respective lists
* Once p1 and p2 meet, it means they have reached the intersection point or the end of both lists
* Return the intersection node (p1) or null if there is no intersection

# time complexity  is O(m + n), where m and n are the lengths of the linked lists headA and headB, respectively. The pointers p1 and p2 traverse the lists at most once.
 # The space complexity is O(1) We are not using any extra
