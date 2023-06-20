/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        
        // Step 1: Create a copy of each node and insert it next to the original node
        Node iter = head;
        while (iter != null) {
            Node copy = new Node(iter.val);
            copy.next = iter.next;
            iter.next = copy;
            iter = copy.next;
        }
        
        // Step 2: Assign random pointers for the copied nodes
        iter = head;
        while (iter != null) {
            if (iter.random != null) {
                iter.next.random = iter.random.next;
            }
            iter = iter.next.next;
        }
        
        // Step 3: Separate the original and copied lists
        iter = head;
        Node pseudoHead = new Node(0);
        Node copyPrev = pseudoHead;
        while (iter != null) {
            Node copy = iter.next;
            Node next = iter.next.next;
            copyPrev.next = copy;
            copyPrev = copy;
            iter.next = next;
            iter = next;
        }
        
        return pseudoHead.next;
    }
}
