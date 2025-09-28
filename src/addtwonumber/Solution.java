package addtwonumber;


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode addTwoNumbers(final ListNode l1, final ListNode l2) {
        final var dummyHead = new ListNode(0);
        var current = dummyHead;
        var carry = 0;
        var p1 = l1;
        var p2 = l2;
        while (p1 != null || p2 != null || carry != 0) {
            final var val1 = (p1 != null) ? p1.val : 0;
            final var val2 = (p2 != null) ? p2.val : 0;
            final var sum = val1 + val2 + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (p1 != null) p1 = p1.next;
            if (p2 != null) p2 = p2.next;
        }
        return dummyHead.next;
    }
}
