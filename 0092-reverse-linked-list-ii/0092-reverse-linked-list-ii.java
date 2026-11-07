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
//     public ListNode reverseBetween(ListNode head, int left, int right) {
//         ListNode temp =head;
//         if(head==null || head.next==null){
//             return head;
//         }
//         for(int i=1;i<left-1;i++){
//              temp=temp.next;
//         }
//         ListNode l= reverse(temp.next,right-left);
//         System.out.println(l.val);
//         ListNode r2=l;
//         ListNode i2=temp.next;
//         while(l.next==null){
//              r2=r2.next;
//              i2=i2.next;
//         }
        
//         System.out.println(r2.val);
//         System.out.println(i2.val);
//         temp.next=l;
//         r2.next=i2.next;
//         return head;
//     }
//     public ListNode reverse(ListNode temp,int i){
//           if(i==0){
//             ListNode p=temp;
//             return p;
//           }
//           ListNode r=reverse(temp.next,i-1);
//           temp.next.next=temp;
//           temp.next=null;
//           return r;
//     }
// }
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head == null || head.next == null || left == right){
            return head;
        }

        ListNode temp = head;

        // Left se pehle wale node tak jaana
        for(int i = 1; i < left - 1; i++){
            temp = temp.next;
        }

        // Original sublist ka first node
        ListNode oldStart = (left == 1) ? head : temp.next;

        // Reversal ke baad connect hone wala node
        ListNode after = oldStart;
        for(int i = 0; i < right - left + 1; i++){
            after = after.next;
        }

        // Sublist reverse
        ListNode newHead = reverse(oldStart, right - left);

        // Original first node ab tail hai
        oldStart.next = after;

        // Left == 1 ka special case
        if(left == 1){
            return newHead;
        }

        temp.next = newHead;

        return head;
    }

    public ListNode reverse(ListNode temp, int i){

        if(i == 0){
            return temp;
        }

        ListNode r = reverse(temp.next, i - 1);

        temp.next.next = temp;
        temp.next = null;

        return r;
    }
}