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
    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode h = head; 
        ListNode eh = h.next;

        ListNode t = h;
        ListNode e = t.next;
        
        while(e!=null && e.next!=null){
            t.next = e.next;
            t = t.next;

            e.next = t.next;
            e = e.next;
        }

        t.next = eh;

        return h;
    }
}
