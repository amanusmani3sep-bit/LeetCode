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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = head;
        int s = 0;

        while (temp != null) {
            temp = temp.next;
            s++;
        }

        k = k % s;

        if (k == 0) {
            return head;
        }

        temp = head;

        for (int i = 0; i < s - k - 1; i++) {
            temp = temp.next;
        }

        ListNode hf = temp.next;
        temp.next = null;

        temp = hf;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = head;

        return hf;
    }
}