package Medium.removeNth;

public class RemoveNthNode {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head, fast = head, curr = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        if (fast == null) {
            head = head.next;
            return head;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        curr = slow.next;
        slow.next = curr.next;

        return head;

    }

    public static void main(String[] args) {
        ListNode l = new ListNode(10);
        l.next = new ListNode(20);
        System.out.println(removeNthFromEnd(l, 2));
    }
}
