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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        Stack<Integer> number = new Stack<>();

        while (slow!=null){
            number.push(slow.val);
            slow = slow.next;
            
        }
        boolean palin = false;

        while (head != null){
            int val = number.pop();

            if(val == head.val) palin = true;
            else 
            {
                palin = false;
                break;
            }
            head = head.next;
        }

        return palin;



        
    }
}
