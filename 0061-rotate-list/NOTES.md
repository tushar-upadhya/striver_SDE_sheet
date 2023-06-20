​# approach
* First, the function performs some base cases checks:
*  * If the head is null, or there is only one node in the list, or k is 0, it returns the head as it is.

* Next, the function calculates the length of the list by traversing through the list and counting the nodes.
* After calculating the length, it links the last node of the list to the first node, creating a circular list. This is done by setting the next pointer of the last node to point to the head.
* Since the rotation can be greater than the length of the list, the value of k is reduced to its modulo length (k = k%length) to ensure it represents the effective rotation.
* The function then calculates the position of the new head after rotation. It subtracts k from the length to get the position of the new end of the list.
* Using a while loop, it traverses to the new end of the list by moving the "temp" pointer k positions forward.
* After reaching the new end, it breaks the link by setting the next pointer of the "temp" node to null.
* Finally, it updates the head to the node following the "temp" node and returns the new head.

# time complexity is O(n)
# space complexity is O(1)
