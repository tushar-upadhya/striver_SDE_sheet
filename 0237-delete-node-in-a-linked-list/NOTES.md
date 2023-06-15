# approach
* The method deleteNode takes a node parameter representing the node to be deleted.
* The code first creates a reference nextNode to the next node after the given node.​
* The value of the nextNode is then copied to the node itself, effectively replacing the node with the next node. This step allows us to effectively delete the given node by overwriting its value.
* The next reference to the node is updated to skip the nextNode and point directly to the node after it. This step essentially removes the nextNode from the linked list.
* Finally, to ensure that the deleted node is completely detached from the list, the next reference of the nextNode is set to null.
#  time complexity of this code is O(1) since the deletion process only involves updating references and copying values
# space complexity is also O(1)
