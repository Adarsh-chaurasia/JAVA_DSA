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
    public int pairSum(ListNode head) {

       ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) 
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode curr = slow;
        ListNode nxt = curr;

        while (curr != null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        int sum = 0;
        int max = 0;

        ListNode node1 = head;
        while(prev != null){
            sum = node1.val + prev.val;
            max = Math.max(sum ,max);
            node1 = node1.next;
            prev = prev.next;

        }

        return max;




        
    }
}
