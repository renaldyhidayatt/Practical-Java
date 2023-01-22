package Medium.addtwosum;

public class AddTwosum {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = new ListNode(0);
        ListNode curr = head;

        while (l1 != null || l2 != null) {
            int val = carry;
            if (l1 != null) {
                val += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                val += l2.val;
                l2 = l2.next;
            }
            curr.next = new ListNode(val % 10);
            curr = curr.next;
            carry = val / 10;
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);

        }

        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(10);
        l1.next = new ListNode(20);
        ListNode l2 = new ListNode(30);
        l2.next = new ListNode(40);
        System.out.println(addTwoNumbers(l1, l2));
    }
}
