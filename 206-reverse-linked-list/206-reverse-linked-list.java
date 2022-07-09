/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        return putPreviousNodeToNext(head, null);
    }
    
    private ListNode putPreviousNodeToNext(ListNode head, ListNode previousNode) {
        
        if(head == null)
            return previousNode;
        
        
        ListNode ref = head.next;
        head.next = previousNode;
        
        return putPreviousNodeToNext(ref,head);
    }
}