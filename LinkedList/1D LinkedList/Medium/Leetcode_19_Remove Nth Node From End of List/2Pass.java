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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = head;
        int length = 1;

        while(temp.next!=null){
            temp = temp.next;
            length++;
        }

        if (length == n) { //length and n same means the nth node from the end is head. remove head
            return head.next;
        }

        int position = length-n; //we need to stop at the node before n

        temp = head;
        int count = 1;

        while(count != position){
            temp = temp.next;
            count++;
        }

        ListNode target = temp.next;
        temp.next = target.next; // or temp.next = temp.next.next;
        target.next = null;

        return head;
    }
}
