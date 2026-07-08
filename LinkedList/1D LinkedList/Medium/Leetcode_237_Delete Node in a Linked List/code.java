/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {

        node.val = node.next.val; //put the next node's value to the current node
        node.next = node.next.next; //point the current node to the next of next node.
        
    }
}

/*How to be like someone?
1. Copy them
 - The current node that we want to delete copies the data of the node next to it. (We don't have to delete the tail so there is always a next)
 - The current node also copies what the next node is pointing to. Both become the same w.r.t. the value and the pointer.

 2. Kill them
 - The next node from which the current copied is now no longer a part of the LinkedList.
*/

// Note that we are using this approach because the head is not given and we are sure that we are not deleting the tail.

// TC: O(1) SC: O(1) as we are just working on a single node
