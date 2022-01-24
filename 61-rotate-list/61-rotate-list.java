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
    
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next == null || k == 0) return head;
        
        ListNode headRef = head;
        int length = 1;
        
        while(headRef.next != null) {
            length++;
            headRef = headRef.next;
        }
        
        
        headRef.next = head;
        k = k % length;
        k = length - k;
        
        while(k-- > 0)
            headRef = headRef.next;
        
        head = headRef.next;
        headRef.next = null;
        
        return head;
    }
}








