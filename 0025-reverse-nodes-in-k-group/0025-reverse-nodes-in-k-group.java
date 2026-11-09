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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        int s=0;
        while(temp!=null){
            s+=1;
            temp=temp.next;
        }
        int p=(s/k);
        if(p<0){
            return head;
        }
        ListNode conn=null;
        ListNode curr=head;
        ListNode hf=head;
        for(int i=0;i<k-1;i++){
               hf=hf.next;
        }
        for(int i=0;i<p;i++){
            ListNode h=reverse(conn,curr,k);
            conn=h;
            curr=conn.next;
        }
        return hf;
    }
    public ListNode reverse(ListNode conn,ListNode curr,int k){
            ListNode prev=null;
            ListNode next=curr.next;
            ListNode last=curr;
            while(k>0){
                curr.next=prev;
                prev=curr;
                curr=next;
                if(next!=null){
                    next=next.next;
                }
                k-=1;
            }
            if(conn!=null){
                conn.next=prev;
            }
            last.next=curr;
            return last;

        
    }
}