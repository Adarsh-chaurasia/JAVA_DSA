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

    public ListNode hasCycle(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return slow;
        }

        return null;

    }
    public ListNode detectCycle(ListNode head) {
        ListNode cycle = hasCycle(head);

        if(cycle == null)
            return null;
        
        ListNode temp = head;

        while(temp!=cycle){
            temp=temp.next;
            cycle = cycle.next;
        }

        return cycle;


        
    }
}
