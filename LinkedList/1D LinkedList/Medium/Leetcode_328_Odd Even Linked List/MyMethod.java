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
        ListNode eh = head.next;
        ListNode t = h;

        while(t!=null && t.next!=null && t.next.next!=null){
            ListNode e = t.next;
            t.next = t.next.next;
            t = t.next;
            e.next = t.next;
        }

        t.next = eh;

        return h;
    }
}
