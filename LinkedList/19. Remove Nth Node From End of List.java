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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head.next == null && n==1)
        {
            head = null;
            return head;
        }
        int count = 0;
        ListNode node = head;
        while(node != null){
            count++;
            node = node.next;
        }

        if(count == n)
            head = head.next;

        else
        {
            int counter = count - n+1;
            ListNode ptr = head;

            for(int i = 1 ; i<counter-1;i++)
            {   
                ptr = ptr.next;
            }
            ptr.next = ptr.next.next;
        }
        

        return head;
    }
}
