package org.vishal.dsa.problems.list;

public class RemoveLinkedListElements {

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode newHead = new ListNode(-1, head);
        ListNode temp = newHead;
        while (temp != null && temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            }else {
                temp = temp.next;
            }
        }
        return newHead.next;
    }

}