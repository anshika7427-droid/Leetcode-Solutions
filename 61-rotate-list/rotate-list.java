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
    public ListNode reverseList(ListNode head) {
        ListNode after = null;
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        int n = 0 ;
        while(temp != null){
            n++;
            temp = temp.next;
        }

        k = k%n;

        if(k == 0){
            return head;
        }
        head = reverseList(head);

        ListNode curr = head;
        ListNode prev = null;
        ListNode first = head;

        for(int i = 0; i < k ; i++){
            ListNode after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }

        head = prev;
        ListNode second = reverseList(curr);
        first.next = second;

        return head;
    }
}