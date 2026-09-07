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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }

        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        //Now, slow is on the mid element, prev is behind slow.

        prev.next = slow.next;

        return head;
    }
}

/*
Time Complexity: O(N/2), we traverse the entire linked list using slow and fast pointers, effectively covering about half the list before reaching the midpoint.
Space Complexity: O(1) , we have fixed number of pointers and variables to delete the Kth node.
*/
