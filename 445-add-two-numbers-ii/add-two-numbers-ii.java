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
    private ListNode reverseList(ListNode head){ 
        ListNode curr = head;
        ListNode prev = null;
        ListNode after = null;

        while(curr != null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        } 
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = reverseList(l1);
        ListNode head2 = reverseList(l2);

        ListNode t1 = head1;
        ListNode t2 = head2;
        ListNode prev = null;
        int carry = 0;

        while(t1 != null || t2 != null){
            int sum = carry;

            if(t1 != null){
                sum += t1.val;
            }
            if(t2 != null){
                sum += t2.val;
            }

            carry = sum/10;
            sum = sum % 10;

            if(t2 != null){
                t2.val = sum;
                prev = t2;
                t2 = t2.next;
            }else{
                prev.next = new ListNode(sum);
                prev = prev.next;
            }
            if(t1 != null){
                t1 = t1.next;
            }
        }
        if(carry != 0){
            prev.next = new ListNode(carry);
        }

        return reverseList(head2);
    }
}