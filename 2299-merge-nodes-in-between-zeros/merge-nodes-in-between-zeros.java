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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp1 = head.next;
        ListNode head2 = new ListNode(-1);
        ListNode temp2 = head2;

        while(temp1 != null){
            int sum = 0;
            while(temp1.val != 0){
                sum = sum + temp1.val;
                temp1 = temp1.next;
            }
            ListNode newNode = new ListNode(sum);
            temp2.next = newNode;
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        return head2.next;
    }
}