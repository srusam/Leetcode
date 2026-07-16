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
        
        //Acc. to the constraints, the min no. of nodes is 1.
        if(head.next == null){ 
            return head;
        }

        ListNode temp = head;
        int count = 1;

        //Count the number of nodes.
        while(temp.next!=null){
            temp = temp.next;
            count++;
        }

        //The formula to find m works for both even and odd count.
        int m = (count/2)+1;
        temp = findMid(head, 0, m);

        return temp;
    }

    public static ListNode findMid(ListNode head, int cnt, int m){

        ListNode temp = head;

        while(temp.next!=null){
            cnt++;

            if(cnt == m){
                break;
            }

            temp = temp.next;
        }

        return temp;
    }
}

//TC: O(N)
//SC: O(1)
