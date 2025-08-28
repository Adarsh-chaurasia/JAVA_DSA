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
    public ListNode deleteMiddle(ListNode head) 
    {
        if(head == null|| head.next == null) return null;
        ListNode revPtr = head;
        ListNode forPtr = head.next.next;
       
        while(forPtr!= null && forPtr.next!= null){
            revPtr = revPtr.next;
            forPtr= forPtr.next.next;

        }
      
         revPtr.next = revPtr.next.next;

       
        return head;


    }
}
