class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int total = 0;
        ListNode current = head;
        while (current != null) {
            total++;
            current = current.next;
        }
        
        int count = 0;
        ListNode prev = null;
        ListNode currentGroup = head;
        ListNode next = null;
        
        while (currentGroup != null && count < k) {
            next = currentGroup.next;
            currentGroup.next = prev;
            prev = currentGroup;
            currentGroup = next;
            count++;
        }
        
        total -= k;
        if (total >= k) {
            head.next = reverseKGroup(next, k);
        } else {
            head.next = next;
        }
        
        return prev; 
    }
}
