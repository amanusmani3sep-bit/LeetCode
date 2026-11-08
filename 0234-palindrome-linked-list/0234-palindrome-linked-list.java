// // /**
// //  * Definition for singly-linked list.
// //  * public class ListNode {
// //  *     int val;
// //  *     ListNode next;
// //  *     ListNode() {}
// //  *     ListNode(int val) { this.val = val; }
// //  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// //  * }
// //  */
// // class Solution {
// //     public boolean isPalindrome(ListNode head) {
// //         if(head == null || head.next == null){
// //             return true;
// //         }
// //         ListNode temp1= head;
// //         ListNode temp2=new ListNode(head.val);
// //         while(temp1.next!=null){
// //             temp1=temp1.next;
// //             temp2.next=new ListNode(temp1.val);
// //             temp2=temp2.next;
// //         }
// //         // temp2.next=new ListNode(temp1.val);
// //         ListNode rl=reverse(temp2);
// //         while(head!=null){
// //             if(rl.val!=head.val){
// //                 return false;
// //             }
// //             head=head.next;
// //             rl=rl.next;
// //         }
// //         return true;
// //     }
// //     public ListNode reverse(ListNode temp){
// //         ListNode prev=null;
// //         ListNode curr=temp;
// //         if(curr==null || curr.next==null){
// //             return curr;
// //         }
// //         ListNode next=curr.next;
// //         while(curr!=null){
// //             curr.next=prev;
// //             prev=curr;
// //             curr=next;
// //             if(next!=null){
// //                 next=next.next;
// //             }
// //         }
// //         return prev;
// //     }
// // }



class Solution {
    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null){
            return true;
        }

        ListNode fast = head;
        ListNode slow = head;
        // Original linked list ki copy banana
        while(fast!=null &&  fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
         if(fast != null){
            slow = slow.next;
        }
          ListNode b=slow;  
        // Copy ko reverse karna
        ListNode rl = reverse(b);
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
// class Solution {
//     public boolean isPalindrome(ListNode head) {

//         if(head == null || head.next == null){
//             return true;
//         }

//         ListNode fast = head;
//         ListNode slow = head;

//         while(fast != null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }

//         // Odd length mein middle node skip
//         if(fast != null){
//             slow = slow.next;
//         }

//         // Second half reverse
//         ListNode rl = reverse(slow);

//         // Compare both halves
//         while(rl != null){

//             if(head.val != rl.val){
//                 return false;
//             }

//             head = head.next;
//             rl = rl.next;
//         }

//         return true;
//     }

//     public ListNode reverse(ListNode temp){

//         ListNode prev = null;
//         ListNode curr = temp;

//         while(curr != null){

//             ListNode next = curr.next;

//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }

//         return prev;
//     }
// }