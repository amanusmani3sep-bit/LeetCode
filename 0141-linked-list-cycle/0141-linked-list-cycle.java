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
        if(head==null){
            return false;
        }
        if(head.next==null){
            return false;
        }
        ListNode temp=head;
        List<ListNode> a=new ArrayList<>();
        while(temp.next!=null){
            if(a.contains(temp.next)){
                return true;
            }
            else{
                a.add(temp);
                temp=temp.next;
            }
        }
        return false;
    }
}