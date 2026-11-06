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
    //     if(head==null || head.next==null){
    //         return head;
    //     }
         
    //      return reverse(head);
         
    // }
    // public ListNode reverse(ListNode node ){
    //      if(node.next==null){
    //         return node ;
    //      }
    //      ListNode ll=reverse(node.next);
    //      node.next.next=node;
    //      node.next=null;
    //      return ll;
       
       ListNode temp=head;
       if(head!=null){
       return reverse(temp,head);
       }
       return head;
    }
    public ListNode reverse(ListNode tail,ListNode head){
        if(tail.next==null){
            head=tail;
            return head;
        }
        ListNode l=reverse(tail.next,head);
        // l.next=tail;
        tail.next.next=tail;
        tail.next=null;
        return l;
    }
}