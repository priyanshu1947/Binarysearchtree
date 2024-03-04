class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return null;

        ListNode curr = head;
        int size = 1;

        // Calculate the length of the linked list and make it circular
        while (curr.next != null) {
            curr = curr.next;
            size++;
        }

        curr.next = head;  // Make the linked list circular

        // Cut the linked list from the rotating point
        int i = size - (k % size);

        while (i > 1) {
            head = head.next;
            i--;
        }

        curr = head.next;  // New head of the rotated linked list
        head.next = null;  // Cut the linked list at the rotating point
        return curr;
    }
}
