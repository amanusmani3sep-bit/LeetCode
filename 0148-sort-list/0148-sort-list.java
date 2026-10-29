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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid= middleNode(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);
        return mergeTwoLists(left,right);
    }
     public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null ){
            if(fast.next==null){
                break;
            }
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        prev.next=null;
        return slow;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode l=new ListNode(0);
        ListNode temp3=l;

        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
               temp3.next=temp1;
               temp3=temp3.next;
               temp1=temp1.next;
            }
            else{
               temp3.next=temp2;
               temp3=temp3.next;
               temp2=temp2.next;
            }

        }
        while(temp1!=null){
               temp3.next=temp1;
               temp3=temp3.next;
               temp1=temp1.next;
        }
        while(temp2!=null){
               temp3.next=temp2;
               temp3=temp3.next;
               temp2=temp2.next;
        }
        l=l.next;
        return l;
    }
}