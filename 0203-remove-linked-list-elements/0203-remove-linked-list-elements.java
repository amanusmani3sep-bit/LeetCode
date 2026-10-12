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
// class Solution {
//     public ListNode removeElements(ListNode head, int val) {
//         ListNode temp=head;
//         // if(head !=null && head.val==val){
//         //         temp=temp.next;
//         //         head=head.next;
//         //     }

//         while(temp!=null && temp.next!=null){
//             if(head.val==val){
//                 // temp=temp.next;
//                 head=head.next;
//             }
//             else if((temp.next!=null) && (temp.next.next==null) && (temp.val==val)){
//                 temp.next=null;
//             }
//             else if(temp.next.val==val){
                
//                 temp.next=temp.next.next;
//             }
//                 temp=temp.next;
//         }
//         return head;
//     }
// }
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode temp = head;

        while (temp != null && temp.next != null) {

            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }
}