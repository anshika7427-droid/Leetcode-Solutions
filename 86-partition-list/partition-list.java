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
    public ListNode partition(ListNode head, int x) {
        if(head == null){
            return head;
        }
        List<Integer> less = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        ListNode temp = head;

        while(temp != null){
            if(temp.val >= x){
                greater.add(temp.val);
                temp = temp.next;
            }else{
                less.add(temp.val);
                temp = temp.next;
            }
        }

        temp = head;

        for(int num : less){
            temp.val = num;
            temp = temp.next;
        }
        for(int num : greater){
            temp.val = num;
            temp = temp.next;
        }

        return head;
    }
}