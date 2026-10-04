class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode prev = null;

        int carry = 0;

        while (t1 != null || t2 != null) {

            int sum = carry;

            if (t1 != null) {
                sum += t1.val;
            }

            if (t2 != null) {
                sum += t2.val;
            }

            carry = sum / 10;
            sum = sum % 10;

            if (t2 != null) {
                t2.val = sum;
                prev = t2;
                t2 = t2.next;
            } else {
                prev.next = new ListNode(sum);
                prev = prev.next;
            }

            if (t1 != null)
                t1 = t1.next;
        }

        if (carry != 0) {
            prev.next = new ListNode(carry);
        }

        return l2;
    }
}