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
        //Create a dummy head
        ListNode dummyHead = new ListNode(0); //0 is a dummy value
        //Make it a part of the linkedlist
        dummyHead.next = head;

        //Create slow and fast pointers pointing to the start.
        ListNode slow = dummyHead;
        ListNode fast = dummyHead;

        //Move fast n times so that it stops exactly before the nth element from the end.
        for(int i=0; i<n; i++){
            fast = fast.next;
        }

        //Move slow and fast pointers at a time until fast reaches the end node.
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        //Now we have arrived at a position where the target element to be removed would be between the slow and fast pointers.
        ListNode target = slow.next;
        slow.next = slow.next.next; //or target.next;
        target.next = null;

        return dummyHead.next; //As the actual head is next to the dummy head.
    }
}
