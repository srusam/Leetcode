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

        //If there are odd no. of nodes, then we will have only 1 mid.
        if(count%2 == 1){
            //Gives the same result as int m = (int) Math.ceil((double) c / 2);
            //We are doing c+1 because c is always +ve.
            int m = (count+1)/2;
            temp = findMid(head, 0, m);
        }
        
        //If there are even no. of nodes, then we will have 2 mids. Take the 2nd.
        else{
            //+1 because we are taking the second mid.
            int m = (count/2)+1;
            temp = findMid(head, 0, m);
        }

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
