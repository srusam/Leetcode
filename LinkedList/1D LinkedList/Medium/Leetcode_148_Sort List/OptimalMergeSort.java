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

    //We can use merge sort or quick sort but merge sort is easier to implement so we are doing that.

    public static ListNode merge(ListNode head1, ListNode head2){

        //Create a dummy node with the value -1 (random) and pointing to null.
        ListNode dummyNode = new ListNode(-1, null);

        ListNode temp = dummyNode;

        ListNode t1 = head1;
        ListNode t2 = head2;

        while(t1!=null && t2!=null){
           if(t1.val <= t2.val){
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            }
                
            else{
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }

        //if either t1 or t2 becomes null, no need to traverse the list which is not null yet. It is already sorted so just join it to the dummy node list.
        if(t1!=null){
            temp.next = t1;
        }
        else{
            temp.next = t2;
        }

        return dummyNode.next;
    }

    public static ListNode getMiddle(ListNode head){

        //If only a single element is left when this function is called...
        if(head == null || head.next == null){
            return head;
        }

        /*
            We will use a modified hare and turtoise algorithm here.
            Usually,
            ListNode slow = head;
            ListNode fast = head;
            But, to find the mid specifically for merge sort, we need m1 (left) and not m2 (right) incase of an even length linkedList. So, we will do the following.
        */

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode sortList(ListNode head) {

        //if only a single element is left.
        if(head == null || head.next == null){
            return head;
        }

        ListNode middle = getMiddle(head);

        //split
        ListNode leftHead = head;
        ListNode rightHead = middle.next;
        //Note that middle is a part of the left.
        //Since middle is the last element of the left, make it point to null so that the split is successful.
        middle.next = null;
            
        //Recursively sort both the parts
        leftHead = sortList(leftHead);
        rightHead = sortList(rightHead);

        //In merge sort for arrays we don't return this function. We simply call it. But here we are returning.
        return merge(leftHead, rightHead);
    }
}

/*
Time Complexity: O(logN x  (N + N/2))
logN: sorting
N/2: hare turtle

Space Complexity: O(1)
*/
