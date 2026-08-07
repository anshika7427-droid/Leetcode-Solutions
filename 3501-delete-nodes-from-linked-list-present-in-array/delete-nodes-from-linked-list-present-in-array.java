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
    private void deleteAt(int idx , ListNode head) {
      ListNode temp = head;
      for (int i = 1; i < idx; i++) {
        temp = temp.next;
      }
      temp.next = temp.next.next;
    }
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            set.add(nums[i]);
        }
        ListNode temp = head;
        while(head != null && set.contains(head.val)){
            head = head.next;
        }
        if(head == null){
            return null;
        }
        ListNode prev = head;
        ListNode curr = head.next;

        while(curr != null){
            if(set.contains(curr.val)){
                curr = curr.next;
                prev.next = prev.next.next;
            }else{
                curr = curr.next;
                prev = prev.next;
            }
        }
        return head;
    }
}