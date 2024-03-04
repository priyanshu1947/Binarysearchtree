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
    public ListNode rotateRight(ListNode head, int k) 
    {
        ListNode curr = head;
        if(head == null)
        {
            return null;
        }
        int length = 1;
        while(curr.next != null)
        {
            curr = curr.next;
            length++;
        }
        curr.next = head;

        int i = length- (k%length);

        while(i>1)
        {
            head= head.next;
            i--;
        }
        curr = head.next;
        head.next = null;
        return curr;
        
    }
}