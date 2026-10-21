/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // if(head==null){
        //     return false;
        // }
        // if(head.next==null){
        //     return false;
        // }
        // ListNode temp=head;
        // List<ListNode> a=new ArrayList<>();
        // while(temp!=null){
        //     if(a.contains(temp)){
        //         return true;
        //     }
        //     else{
        //         a.add(temp);
        //         temp=temp.next;
        //     }
        // }
        // return false;
        ListNode temp1=head;
        ListNode temp2=head;
        while(temp1!=null && temp2!=null && temp2.next!=null){
            temp1=temp1.next;
            temp2=temp2.next.next;
            if(temp1==temp2){
                return true;
            }


        }
        return false;
    }
}