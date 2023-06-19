# approach
* Initialize two pointers, slow and fast, to the head of the linked list.
* Use the fast pointer to move two steps at a time and the slow pointer to move one step at a time. This way, when the fast pointer reaches the end of the linked list, the slow pointer will be pointing to the middle element (or the first middle element in the case of an odd-length list).
* Reverse the second half of the linked list by iterating from the middle (stored in slow) to the end. While iterating, rearrange the pointers to reverse the direction of the linked list.
* After the reversal, set the fast pointer back to the head of the linked list, and the slow pointer to the reversed second half.
* Compare the values of nodes pointed to by the fast and slow pointers. If they differ at any point, return false (indicating the linked list is not a palindrome).
* If the loop completes without any mismatches, return true (indicating the linked list is a palindrome).

# time complexity is O(N), where N is the number of nodes in the linked list, as we traverse the list twice (once to find the middle and once to compare the values).
# space complexity is O(1) 
