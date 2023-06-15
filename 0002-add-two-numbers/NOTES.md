# approach

* The method addTwoNumbers takes two input parameters: l1 and l2, which represent the heads of the two linked lists containing the numbers to be added.
* The code creates a new dummy node as a placeholder for the result linked list. It also initializes a temp node that initially points to the dummy node.
* An int variable carry is used to keep track of the carry during addition. It is initially set to 0.
* The code enters a loop that continues until both input linked lists (l1 and l2) are exhausted, and there is no carry left to be added.
* Inside the loop, the code calculates the sum of the current digits from l1, l2, and the carry. If either l1 or l2 is not null, the corresponding digit is added to the sum and the respective pointer is moved to the next node.
* The code then updates the sum by adding the carry to it. The carry is then calculated as the integer division of the sum by 10.
* A new node is created with the digit value equal to the remainder of the sum divided by 10. This digit is added to the temp node's next reference.
* The temp pointer is moved to the next node to prepare for the next iteration.
* After the loop completes, if there is any remaining carry, a final node is added to the result linked list with the carry as its value.
* Finally, the modified linked list, starting from the dummy node's next reference, is returned as the sum of the two input numbers.

#  time complexity  is O(max(N, M)), where N and M are the lengths of the two input linked lists l1 and l2
# space complexity is O(max(N, M)) 
