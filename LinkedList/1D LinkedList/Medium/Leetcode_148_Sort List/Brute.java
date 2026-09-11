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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head;

        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }

        Collections.sort(list);

        temp = head;

        for(int i=0; i<list.size(); i++){
            temp.val = list.get(i);
            temp = temp.next;
        }

        return head;
    }
}

/*
Time Complexity: O(2*N + N*LogN), we traverse the linked list, store its elements in an array, sort it, and then copy the sorted values back into the original list.
Space Complexity: O(N) , additional space required to store all the elements of linked list in an array.
*/
