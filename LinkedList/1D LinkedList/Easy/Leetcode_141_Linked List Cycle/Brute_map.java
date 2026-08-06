/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;

        Map<ListNode, Integer> map = new HashMap<>();

        while(temp!=null){
            if(map.containsKey(temp)){
                return true;
            }
            map.put(temp,1);
            temp = temp.next;
        }

        return false;
    }
}

/*
Time Complexity: O(N*LogN), we traverse the entire linked list once and store and retrieve nodes from the hash map. Map operations have a worst time space complexiy of O(LogN).
Space Complexity: O(N) , additional amount of extra space is used to store nodes in a hash map.
*/
