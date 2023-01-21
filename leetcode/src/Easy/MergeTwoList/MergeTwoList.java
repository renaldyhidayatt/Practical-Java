package Easy.MergeTwoList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class MergeTwoList {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1);
        ListNode pos = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                pos.next = l1;
                l1 = l1.next;
            } else {
                pos.next = l2;
                l2 = l2.next;
            }
            pos = pos.next;
        }

        if (l1 != null) {
            pos.next = l1;
        }
        if (l2 != null) {
            pos.next = l2;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        System.out.println(mergeTwoLists(l1, l2));
    }
}