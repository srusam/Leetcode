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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        ListNode temp = head;

        while(temp!=null){
            stack.push(temp.val);
            temp = temp.next;
        }

        temp = head;

        while(temp!=null){
            if(temp.val != stack.peek()){
                return false;
            }
            stack.pop();
            temp = temp.next;
        }

        return true;
    }
}

/*
Time Complexity: O(N), we traverse the entire linked list twice, once to push all elements into the stack, and once to compare them with the original list.

Space Complexity: O(N), we use a stack that stores all the elements of the linked list, which takes linear space in the worst case.
*/
