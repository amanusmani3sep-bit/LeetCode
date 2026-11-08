// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
class Solution {
    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null){
            return true;
        }

        ListNode fast = head;
        ListNode slow = head;

        // Original linked list ki copy banana
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode b = slow;

        // Copy ko reverse karna
        ListNode rl = reverse(b);
        slow.next = null;

        // Dono linked lists compare karna
        while(head != null && rl != null){
            if(rl.val != head.val){
                return false;
            }

            head = head.next;
            rl = rl.next;
        }

        return true;
    }

    public ListNode reverse(ListNode temp){

        ListNode prev = null;
        ListNode curr = temp;

        while(curr != null){
            ListNode next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}