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
    public ListNode detectCycle(ListNode head) {
        ListNode temp = head;

        Map<ListNode, Integer> map = new HashMap<>();

        while(temp!=null){
            if(map.containsKey(temp)){
                return temp;
            }

            map.put(temp,1);
            temp = temp.next;
        }

        return null;
    }
}

/*
Time Complexity: O(N) where N is the number of nodes in the linked list. Each node is visited only once during traversal. Hashing allows O(1) lookup to check for previously visited nodes.

Space Complexity: O(N) due to the additional hash set used to store visited nodes. In the worst case (no cycle), all N nodes will be stored in the hash set.
*/
