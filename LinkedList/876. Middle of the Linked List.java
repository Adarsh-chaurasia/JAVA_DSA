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
        int count = 0;

        ListNode ptr = null;
        ListNode node = null;

        ptr = head;

        while(ptr != null){
            count++;
            ptr=ptr.next;
        }

        int n = count/2;

        node = head;
        int i = 0;
        while(i<n){
            node = node.next;
            i++;
        }

        head = node;

        return head;
        
    }
}
