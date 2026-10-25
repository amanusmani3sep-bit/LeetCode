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
    public ListNode detectCycle(ListNode head) {
        List<ListNode> l=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            if(l.contains(temp)){
                return temp;
            }
            else{
                l.add(temp);
            }
            temp=temp.next;
        }
        return null;
    }
}