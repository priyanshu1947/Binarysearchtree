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
    public ListNode reverseList(ListNode head) {
        ListNode front;
        ListNode prev = null;
        while(head!=null)
        {
        front = head.next;
        head.next = prev;
        prev= head;
        head = front;
        }
        return prev;

    }
    
}