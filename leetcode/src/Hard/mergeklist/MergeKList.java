package Hard.mergeklist;

public class MergeKList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null) {
            return null;
        } else if (lists.length == 0) {
            return null;
        }

        return mergeK(lists, 0, lists.length - 1);
    }

    public static ListNode mergeK(ListNode[] lists, int low, int high) {
        if (low == high) {
            return lists[low];
        } else if (low + 1 == high) {
            return mergeTwoLists(lists[low], lists[high]);
        }

        int mid = (low + high) / 2;
        return mergeTwoLists(mergeK(lists, low, mid), mergeK(lists, mid + 1, high));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode curr = new ListNode(-1);
        ListNode head = curr;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;

            }

            curr = curr.next;
        }
        if (l1 != null) {
            curr.next = l1;
        }
        if (l2 != null) {
            curr.next = l2;
        }
        return head.next;
    }
}