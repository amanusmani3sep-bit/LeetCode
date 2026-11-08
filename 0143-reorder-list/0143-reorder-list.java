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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return ;
        }
        ListNode temp=head;
        ListNode fast = head;
        ListNode slow = head;

        // Original linked list ki copy banana
        ListNode p=null;
        while(fast != null && fast.next != null){
            p=slow;
            slow = slow.next;
            fast = fast.next.next;
            
        }
        if(fast!=null){
            p=slow;
            slow=slow.next;
        }
         p.next=null;
        ListNode b = slow;

        // Copy ko reverse karna
        ListNode rl = reverse(b);
     
        while(rl!=null){
            ListNode next=rl.next;
            rl.next=temp.next;
            temp.next=rl;
            rl=next;
            temp=temp.next.next;
        }

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