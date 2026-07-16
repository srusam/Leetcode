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
    public ListNode middleNode(ListNode head) {
        //The Tortoise and Hare algorithm 

        ListNode slow = head;
        ListNode fast = head;

        //We are doing fast!=null and fast.next!=null both for fast because fast moves 2 steps ahead. So there is a chance that the new step is null. We will know only when we reach there.
        while(fast!=null && fast.next!=null && slow!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //While fast reaches the end, slow reaches the mid.
        return slow;
    }
}

//TC: O(N/2)
//SC: O(1)
