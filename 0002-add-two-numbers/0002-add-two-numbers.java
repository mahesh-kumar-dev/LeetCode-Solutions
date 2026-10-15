
//  // Definition for singly-linked list.
//   public class ListNode {
//       int val;
//       ListNode next;
//       ListNode() {}
//       ListNode(int val) { this.val = val; }
//       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//   }
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       // create the dumpyhead pointer with value 0
       ListNode dummyHead = new ListNode(0);
       // and then use that dummy head as reference to the current 
       ListNode current = dummyHead;
       // now we have to keep the carry in mind initially it is zero
       int carry = 0; 

       // loop until both list are empty and no carry remain
       while(l1 != null || l2 != null || carry != 0){
        // get the value from the current node, or 0 if list has ended
        int val1 = (l1 != null) ? l1.val : 0;
        int val2 = (l2 != null) ? l2.val : 0;

        // now add the corresponding numbers
        int sum = val1 + val2 + carry;
        carry = sum / 10; // calculate new carry

        // create newNode single digit
        current.next = new ListNode(sum % 10);
        current = current.next;

        // move to next node 
        if (l1 != null) l1 =  l1.next;
        if (l2 != null) l2 = l2.next;


        
       }
       return dummyHead.next;
    }
}