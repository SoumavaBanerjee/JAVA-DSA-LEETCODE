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
    
    
    static int length(ListNode head) {
        if(head == null)
            return 0;
        
        ListNode temp = head;
        int ctr = 0;
        
        while(temp != null) {
            temp = temp.next;
            ctr++;
        }
        
        return ctr;            
    }
    
    public ListNode swapNodes(ListNode head, int k) {
        ListNode prev, curr;
        
        if(head == null)
            return null;
        
        curr = head;
        prev = head;
        
        int kLastNode = length(head) - k;
        
        while(k-- > 1 && curr != null)
            curr = curr.next;
        
        while(kLastNode-- > 0 && prev != null)
            prev = prev.next;
        
        // value swap
        
        int temp = curr.val;
        curr.val = prev.val;
        prev.val = temp;
        
        return head;
    }
}