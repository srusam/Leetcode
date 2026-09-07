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
        //Single node case
        if(head.next == null){
            return null;
        }

        int n = 1;
        ListNode temp = head;
        //Find out the length of the linkedlist.
        while(temp.next!=null){
            n++;
            temp = temp.next;
        }

        //Find out the mid index (ceil value).
        int midIdx = n/2;

        //Position temp back to head.
        temp = head;

        //Run a for loop to land temp right before the target mid element.
        for(int i=0; i<midIdx-1; i++){
            temp = temp.next;
        }

        ListNode target = temp.next;
        temp.next = target.next;
        target.next = null;

        return head;
    }
}

// Time Complexity: O(N + N/2), we traverse the entire linked list once to count the number of nodes and then traverse again to delete the middle node.
// Space Complexity: O(1) , we have fixed number of pointers and variables to delete the Kth node.
